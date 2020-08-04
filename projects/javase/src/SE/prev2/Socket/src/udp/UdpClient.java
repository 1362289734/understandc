package udp;

import java.io.IOException;
import java.net.*;

public class UdpClient {


    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String word = "hello";

        byte[] bytes = word.getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                InetAddress.getByName("127.0.0.1"), 5000);

        socket.send(packet);
        socket.close();


    }

}

