package com.company.SocketClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {

    public static void main(String args[]) throws IOException {
        int port=1234;
        System.out.println("waiting for client...");
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        System.out.println("connection established");
        BufferedReader clientMessage = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = clientMessage.readLine();
        PrintWriter printWritersocket = new PrintWriter(socket.getOutputStream(),true);
        printWritersocket.println("server message"+message);
    }
}
