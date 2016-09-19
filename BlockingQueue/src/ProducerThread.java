public class ProducerThread extends MyThread{  // MyThread is on moodle under lab  resources

	MyBlockingQueue buffer;
	public ProducerThread(MyBlockingQueue theBuffer, int brake) {
	super(brake) ;
	buffer = theBuffer;
	}
		public void run() {
		try {
		for (int i = 0; i < 20; i++) {
		Customer cust = new Customer(i,i);
		System.out.println("Producer adds customer: " + cust.id);
		buffer.insert(cust);
		mySleep() ;
	}
		System.out.println("Producer DONE! ");
	} catch (Exception e) {
		e.printStackTrace();

		}
	}
}
