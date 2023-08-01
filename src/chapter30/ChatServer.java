package chapter30;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public static ChatRoom room = new ChatRoom();

    public static void main(String[] args) {
        try {
            int port = 30000;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Chat Server start with port " + port + "...");

            while (true) {
                Socket socket = serverSocket.accept();
                ChatRunner runner = new ChatRunner(socket);
                ChatServer.room.addChatRunner(runner);
                runner.start();
            }
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
