package day18.실습;

public class ThreadLab {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread3 thread3 = new Thread3();
		Thread4 thread4 = new Thread4();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		System.out.println("MAIN 수행 종료");

	}
}

class Thread1 extends Thread {
	public Thread1() {
		setName("자식 스레드1: ");
	}

	public void run() {
		try {
			for (int i = 65; i <= 76; i++) {
				System.out.println(getName() + (char) i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Thread2 extends Thread {
	public Thread2() {
		setName("자식 스레드2: ");
	}

	public void run() {
		try {
			for (int i = 97; i <= 104; i++) {
				System.out.println(getName() + (char) i);
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Thread3 extends Thread {
	public Thread3() {
		setName("자식 스레드3: ");
	}

	public void run() {
		try {
			for (int i = 1; i <= 30; i++) {
				System.out.println(getName() + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Thread4 extends Thread {
	public Thread4() {
		setName("자식 스레드4: ");
	}

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + "JAVA");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
