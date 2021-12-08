package Exercices;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.sayHello());
            System.out.println(service1.uppercase("ameni"));
            System.out.println(service1.indexOf("ameni",'n'));
            System.out.println(service1.palindrome("stts"));


        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
