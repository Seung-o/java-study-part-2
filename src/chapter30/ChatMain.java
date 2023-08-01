package chapter30;

import java.io.IOException;

public class ChatMain {

    public static void main(String[] args) throws IOException {

        ChatClient client;
        String nickname = "summer";
        client = new ChatClient(nickname, "localhost", 30000);
        client.setSize(300, 200);
        client.setTitle(nickname);
        client.setVisible(true);

    }
}
