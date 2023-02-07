package MultiThreading;


class MulTh extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Eclipse thread ID is "+Thread.currentThread().getId());
		
		try {
			sleep(1000);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	}
}


public class Sleep {

	public static void main(String[] args) {
		MulTh obj = new MulTh();
		obj.start();

	}

}
