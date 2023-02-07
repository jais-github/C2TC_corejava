package MultiThreading;


class counter{
	int count;
	public synchronized void increment() {
		count++;
	}
}


public class Synchronization {

	public static void main(String[] args) {
		counter c = new counter();
		Thread t1= new Thread(new Runnable() {
			public void run() {
				c.increment();
			}
		});
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t2=new Thread (new Runnable() {
			public void run() {
				c.increment();
			}
		});
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.count);
	}
	

}
