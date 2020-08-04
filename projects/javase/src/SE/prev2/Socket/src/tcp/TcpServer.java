package tcp;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();
            System.out.println("服务器启动");
            System.out.println(socket.getInetAddress().getHostAddress()+"connected...");
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int count  = inputStream.read(bytes);
//            while (count > 0) {
//                System.out.println(new String(bytes,0,count));
//                count  = inputStream.read(bytes);
//            }
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("收到".getBytes());
            System.out.println("");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
