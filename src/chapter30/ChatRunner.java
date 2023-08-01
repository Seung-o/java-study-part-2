package chapter30;

import java.io.*;
import java.net.Socket;

public class ChatRunner extends Thread {
    private final Socket socket;
    private BufferedReader bufferedReader = null;
    private BufferedWriter bufferedWriter = null;
    private boolean flag = false;

    public ChatRunner(Socket socket) throws IOException {
        this.socket = socket;
        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }

    public void run() {
        while (!flag) {
            try {
                String message = bufferedReader.readLine();

                if (message != null && message.equals("")) {
                    ChatServer.room.sendMessageAll(message);
                } else {
                    this.flag = true;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        ChatServer.room.removeChatRunner(this);
        try {
            bufferedReader.close();
            bufferedWriter.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMessage(String message) throws IOException {
        bufferedWriter.write(message + "\n");
        bufferedWriter.flush();
    }
}
