package com.company.SocketClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocketDemo {
    public static void main(String args[]) throws IOException {
        int port=1234;
        String host="127.0.0.1";
        System.out.println("client started...");
       // ServerSocket serverhi
        // Socket = new ServerSocket(port);
        Socket socket = new Socket(host,port);
       // System.out.println("connection established");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the message");
        String message = userInput.readLine();
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
        printWriter.println(message);
        BufferedReader receivedMessage = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(receivedMessage.readLine());


    }
}
