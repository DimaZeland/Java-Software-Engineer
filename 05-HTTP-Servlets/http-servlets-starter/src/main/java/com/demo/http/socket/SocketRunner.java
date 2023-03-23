package com.demo.http.socket;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketRunner {
    public static void main(String[] args) throws IOException {
        InetAddress inetAddress = Inet4Address.getByName("localhost");
        try (Socket socket = new Socket(inetAddress, 7777);
             DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
             DataInputStream inputStream = new DataInputStream(socket.getInputStream());
             Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String request = scanner.nextLine();
                outputStream.writeUTF(request);
                System.out.println("Response from server: " + inputStream.readUTF());
            }

        }
    }
}
