package Exercices.ex3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static final int port = 1200;

    public static void main(String[] args) throws Exception {

        // Listen to a specific port

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Waiting for connection");
        Socket socClient = serverSocket.accept(); // Accept a client socket
        System.out.println("Connection established");

        // Initialize in / out
        // BufferedReader inServer = new BufferedReader(new InputStreamReader(socClient.getInputStream()));
        // PrintWriter outServer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socClient.getOutputStream())), true);

        // Read message sent by the client
        // inServer.readLine();
        // Write message to the client
        //  System.out.println("something");

        // ****** if you're using DataInputStream & DataOutputStream ******

        DataInputStream inServer = new DataInputStream(socClient.getInputStream());
        DataOutputStream outServer = new DataOutputStream(socClient.getOutputStream());

        // Read message sent by the client
        String s = inServer.readUTF();

        boolean palindrome=true;
            for(int i=0,j=s.length()-1;i<=j;i++,j--)
            {
                if (s.charAt(i)!=s.charAt(j))
                {
                    palindrome=false;
                    break;
                }
            }
            System.out.println("isPalindrome : "+palindrome);





        // ****** if you're using DataInputStream & DataOutputStream ******

        // Close in / out
        inServer.close();
        outServer.close();

        // Close client socket
        socClient.close();
        serverSocket.close();
    }
}
