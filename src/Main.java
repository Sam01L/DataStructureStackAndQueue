import java.util.Queue;

public class Main {

    public static void main(String[] args) {

       // Queue<myQueue>  = new Queue<>();
        myQueue queue = new myQueue();
        final int total = 300;
        System.out.println("Test 1");

        Thread put = new Thread();
        for (int i = 0; i <= total; i++)
        {
            boolean add = queue.put(i);
            System.out.println("PUT " + add);
            //System.out.println("PUT " + queue.put(i));
        }

        Thread get = new Thread();
        for (int i = 0; i < total; i++)
        {
            Object obj = queue.get();
            System.out.println("GET " + obj);
        }


        put.start();
        get.start();

        // System.out.println("Test 2");
        //for (int i = 1; i <= 300; i++){
         //   boolean stored = queue.put(i);
         //   Object retrieved = queue.get();
          //  System.out.println("Put " +  i + " Success " + stored + " Got: " + retrieved);
        //}
    }
}



