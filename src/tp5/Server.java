package Exercices;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public String sayHello() {
        return "Hello World !!";
    }
    public String uppercase(String s) {
        return s.toUpperCase();
    }
    public int indexOf(String s, char c) {
        return s.indexOf(c);
    }
    public String palindrome(String s) {
        boolean palindrome = true;
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                palindrome = false;
                break;
            }
        }
        return "isPalindrome : " + palindrome;
    }



    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
