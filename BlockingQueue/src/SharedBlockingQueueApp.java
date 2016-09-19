class SharedBlockingQueueApp {
    public static void main(String args[]) {
      MyBlockingQueue buffer = new MyBlockingQueue() ;
      Thread t1 = new ProducerThread(buffer,1000) ;
      Thread t2 = new ConsumerThread(buffer,1000) ;
      t1.start() ; t2.start() ;
    }
}
