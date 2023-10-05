package ex05;



public class CurrentThreadName3 {

	public static void main(String[] args) {
		Runnable task1 = () ->{
			for(int i =0; i < 20; i++) {
				if(i%2 == 0)
					System.out.println(i + " ");//짝수
/*				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
		};
	
		Runnable task2 = () -> {
			for(int i =0; i < 20; i++) {
				if(i%2 == 1)
					System.out.println(i + " ");//홀수
				/**/
			}
		};
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		System.out.println("end: " + Thread.currentThread().getName());
	}

}
