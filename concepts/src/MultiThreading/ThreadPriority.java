package MultiThreading;


class Eclips extends Thread{
	public void run() {
		System.out.println("Eclipse thread ID is"+Thread.currentThread().getPriority());
	}
}

class Ppts extends Thread{
	public void run() {
		System.out.println("PPt thread ID is"+ Thread.currentThread().getId());
		System.out.println("Ppt thread priority is"+Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		Eclips obj = new Eclips();
		obj.start();
		obj.setPriority(7);
		Ppts obj1=new Ppts();
		obj1.start();
		obj1.setPriority(3);

	}

}
