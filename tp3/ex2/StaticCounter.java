package ex2;

public class StaticCounter {
	   private static int counter = 0;

	    // todo : implement me
	    public synchronized static void increment(){
	    	counter ++;
	    	System.out.println(counter);
	    }
	    
		public static int getCounter() {
			return counter;
		}

		public static void setCounter(int counter) {
			StaticCounter.counter = counter;
		}
}
