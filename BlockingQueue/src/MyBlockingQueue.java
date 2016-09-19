public class MyBlockingQueue {
	final int BUFFERSIZE = 10 ;
	Customer[] bufferArray = new Customer[BUFFERSIZE] ;
	int nextIn, nextOut, inUse ;

	public MyBlockingQueue () {
		nextIn = 0 ;
		nextOut = 0 ;
		inUse = 0 ;
	}

	synchronized public void insert(Customer item) {
		  try {
		    while(inUse == BUFFERSIZE) {
		      wait() ;
		    }
		    bufferArray[nextIn] = item ;
		    inUse++ ;
		    nextIn = (nextIn +1) % BUFFERSIZE ;
		    notifyAll() ;
		  }
		  catch (InterruptedException e) {}
		}
	synchronized public Customer extract() {
		Customer item= null ;
	    try {
	      while(inUse == 0) {
	        wait() ;
	      }
	      item = bufferArray[nextOut] ;
	      inUse-- ;
	      nextOut = (nextOut + 1) % BUFFERSIZE ;
	      notifyAll() ;
	    } catch (InterruptedException e) {}
	    return item;
	  }
	}

