public class Put implements Runnable {
    myQueue sharedQueue;

    public Put(myQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {
        for (int i = 0; i <= 100; i++) {
            boolean add = sharedQueue.put(i);
            while (!add) {
                add = sharedQueue.put(i);
            }
                System.out.println("PUT " + i + ": " + add);
        }
    }
}

