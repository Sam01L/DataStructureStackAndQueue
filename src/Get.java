public class Get implements Runnable {
    myQueue sharedQueue;

    public Get(myQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {
        for (int i = 200; i <= 300; i++) {
            Object value = sharedQueue.get();
            while (value.equals("Empty")) {
                value = sharedQueue.get();
            }
            System.out.println("GET " + value);
        }
    }
}
