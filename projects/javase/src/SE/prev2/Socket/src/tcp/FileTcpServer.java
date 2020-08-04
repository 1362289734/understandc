package tcp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileTcpServer {

    public static void main(String[] args) {
        String path = "D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\Socket/InTHeNameOfLove.mp3";
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();
            System.out.println("服务器启动");
            System.out.println(socket.getInetAddress().getHostAddress() + "connected...");

            InputStream inputStream = socket.getInputStream();
            byte[] lengthBytes = new byte[4];
            int read = inputStream.read(lengthBytes);
            int len = parse(lengthBytes);
            System.out.println("文件长度:" + len);
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            byte[] buf = new byte[1024];
            int count = inputStream.read(buf, 0, Math.min(buf.length, len));
            while (len > 0) {
                fileOutputStream.write(buf, 0, count);
                len -= count;
                count = inputStream.read(buf, 0, Math.min(buf.length, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static int parse(byte[] bytes) {
        int rlt = 0;
        for (int i = 0; i < bytes.length; i++) {
            rlt |= (int) bytes[i] << 8 * (3 - i);
        }
        return rlt;
    }


}
