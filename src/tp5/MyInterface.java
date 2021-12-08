package Exercices;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String sayHello()throws RemoteException;
    String uppercase(String s)throws RemoteException;
    int indexOf(String s, char c)throws RemoteException;
    String palindrome(String s)throws RemoteException;


}
