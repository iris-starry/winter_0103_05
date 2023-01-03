package thread.generate;

public class ThreadTest1 extends Thread {
	
	public ThreadTest1(String name) {
		super(name); //Thread 이름 설정
	}
	
	
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+"thread 실행"+(i+1));
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1("첫번째 "); // new born 상태
		t1.start(); //runnable 상태
		
		ThreadTest1 t2 = new ThreadTest1("두번째 "); // new born 상태
		t2.start(); //runnable 상태
	}

}
