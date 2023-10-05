package ex05;

class Counter2{
	int count = 0;

	public void increment() {
		synchronized (this) {// 하는 동안 접근못해!
			count++;
		}
	}

	public void decrement() {
		synchronized (this) {// 하는 동안 접근못해!
			count--;
		}
	}

	public int getCount() { return count; }
}


public class CurrentThreadName5 {
	
	public static void main(String[] args) throws InterruptedException{
		
		Thread t1 = new Thread (() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread (()  -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("world");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	
	}

}
