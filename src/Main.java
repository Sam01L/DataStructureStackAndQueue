public class Main {
    public static void main(String[] args) {
        myQueue queue = new myQueue();

        Put put1 = new Put(queue);
        Put put2 = new Put(queue);
        Put put3 = new Put(queue);
        Get get1 = new Get(queue);
        Get get2 = new Get(queue);
        Get get3 = new Get(queue);

        Thread putThread = new Thread(put1);
        Thread put2Thread = new Thread(put2);
        Thread put3Thread = new Thread(put3);
        Thread getThread = new Thread(get1);
        Thread get2Thread = new Thread(get2);
        Thread get3Thread = new Thread(get3);

        putThread.start();
        put2Thread.start();
        put3Thread.start();
        getThread.start();
        get2Thread.start();
        get3Thread.start();
    }
}
