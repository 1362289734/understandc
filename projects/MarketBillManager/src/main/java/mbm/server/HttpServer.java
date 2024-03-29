package mbm.server;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(5000);

        while (true) {
            Socket clientSocket = serverSocket.accept();
//            SocketHandler2 socketHandler2 = new SocketHandler2(clientSocket);
//            socketHandler2.start();
//            SocketHandler1 socketHandler1 = new SocketHandler1(clientSocket);
//            socketHandler1.start();
            SocketHandler socketHandler = new SocketHandler(clientSocket);
            socketHandler.start();
        }


//            SocketHandlerJsp socketHandlerJsp = new SocketHandlerJsp(clientSocket);
//            socketHandlerJsp.start();

        // response header
        // HTTP/1.1 200 OK
        // Content-Type: text/html; charset=utf-8
        // Content-Length: 1234
        //
        // bytes

        // "HTTP/1.1 200 OK\r\n"
        // "Content-Type: text/html; charset=utf-8\r\n"
        // "Content-Length: 1234\r\n"
        // "\r\n"
        // data

        // out.writeBytes("HTTP/1.1 200 OK");
        // out.writeBytes("\r\n");
        // out.writeBytes("Content-Type: text/html; charset=utf-8");
        // out.writeBytes("\r\n");
        // out.writeBytes(("Content-Length: " + resourceAsStream.available()));
        // out.writeBytes("\r\n");
        // out.writeBytes("\r\n");
    }
}
