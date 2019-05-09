package ChatApp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public Server() {
        createServer(2000);
    }

    private void createServer(int portNumber) {

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(portNumber);

            Socket connectionSocket = serverSocket.accept();

            //Create Input and output streams for the connection
            InputStream inputToServer = connectionSocket.getInputStream();
            OutputStream outputFromServer = connectionSocket.getOutputStream();

            Scanner scanner = new Scanner(inputToServer, "UTF-8");
            PrintWriter serverPrintOut = new PrintWriter(new OutputStreamWriter(outputFromServer, "UTF-8"),true);

            serverPrintOut.println("Welcome enter command bye to exit");

            // Listen for input from the client

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.equals("bye")){
                    break;
                }

                serverPrintOut.println("You entered: " + line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
