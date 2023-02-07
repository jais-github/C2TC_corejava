package MultiThreading;


class Eclip implements Runnable{
	public void run() {
		System.out.println("Eclipse thread ID is"+" "+Thread.currentThread().getId());
	}
}

class PP implements Runnable{
	public void run() {
		System.out.println("PPT thread ID is"+" "+ Thread.currentThread().getId());
	}
}
public class ImpplementRunnable {

	public static void main(String[] args) {
		Eclip obj = new Eclip();
		Thread t = new Thread(obj);
		t.start();
		PP obj1 = new PP();
		Thread t1=new Thread(obj1);
		t1.start();
	}

}
