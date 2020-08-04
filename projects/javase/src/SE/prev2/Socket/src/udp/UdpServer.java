package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {


    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new  DatagramSocket(5000);

        byte[] bytes = new byte[1024];

        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        datagramSocket.receive(datagramPacket);

        System.out.println(datagramPacket.getAddress().getHostAddress());
        System.out.println(datagramPacket.getPort());
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));



















    }
}
