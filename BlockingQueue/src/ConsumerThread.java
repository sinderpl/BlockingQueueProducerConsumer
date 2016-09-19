public class ConsumerThread extends MyThread {


MyBlockingQueue buffer;

public ConsumerThread(MyBlockingQueue theBuffer, int brake) {
super(brake) ;
buffer = theBuffer;
}

public void run() {
	try {
	for (int i = 0; i < 20; i++) {
	Customer value = buffer.extract();
	mySleep();

	System.out.println("Consumer extracts consumer with id: " + value.id+ " balance: "+value.balance);
	}
		System.out.println("Consumer DONE! ");
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
