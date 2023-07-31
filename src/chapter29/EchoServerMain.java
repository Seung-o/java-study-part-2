package chapter29;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class EchoServerMain {
    private static final int PORT = 50000;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(EchoServerMain.PORT);
            System.out.println("Echo Server Running on PORT " + EchoServerMain.PORT + " ....");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(new Date() + ": " + socket.toString());

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                String line = bufferedReader.readLine();
                bufferedWriter.write(line + "1\n");
                bufferedWriter.flush();
                bufferedWriter.write(line + "2\n");
                bufferedWriter.flush();
                bufferedWriter.write(line + "3\n");
                bufferedWriter.flush();

                bufferedReader.close();
                bufferedWriter.close();
                socket.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
