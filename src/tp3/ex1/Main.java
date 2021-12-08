package ex1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     MyThread t = new MyThread ();
     t.start();
     ThreadRunnable t2 = new ThreadRunnable ();
     Thread t3 = new Thread (t2);
     t3.start();
     t.join();
     t3.join();
     System.out.println("it s over!");
     // l main bach ti5dem kan baad matistana l t w t3 ikamlo l execution 
	}

}
