

public class MyThread extends Thread {
	int brake ;

	MyThread(String name, int brake) {
		super(name) ;
		this.brake = brake ;
	}

	MyThread(int brake) {
		this.brake = brake ;
	}

	MyThread(String name) {
		super(name) ;
		brake = 0 ;
	}

	MyThread() {
		brake = 0 ;
	}

	public void mySleep() {
		if (brake != 0) {
			try {
				sleep((long) (Math.random() * brake));
			}
			catch (InterruptedException e) {
				;
			}
		}
	}
}