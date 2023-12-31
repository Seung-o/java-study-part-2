package chapter30;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ChatRoom extends ArrayList<ChatRunner> {
    public synchronized void addChatRunner(ChatRunner runner) {
        add(runner);
    }

    public synchronized void removeChatRunner(ChatRunner runner) {
        if (this.contains(runner)) {
            remove(runner);
        }
    }

    public void sendMessageAll(String message) throws IOException {
        Iterator<ChatRunner> ir = this.iterator();
        while (ir.hasNext()) {
            ChatRunner runner = ir.next();
            runner.sendMessage(message);
        }
    }
}
