package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {


    public static void main(String[] args) {

        Socket socket=null;
        try {
            socket = new Socket("127.0.0.1",5000);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("hello".getBytes());
//            Thread.sleep(10000);
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int count  = inputStream.read(bytes);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }






}
