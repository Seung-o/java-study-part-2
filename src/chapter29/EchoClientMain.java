package chapter29;

import java.io.*;
import java.net.Socket;

public class EchoClientMain {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50000);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            bufferedWriter.write("Hello Java \n");
            bufferedWriter.flush();

            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());

            bufferedReader.close();
            bufferedWriter.close();
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
