import java.util.Queue;

public class Main {

    public static void main(String[] args) {

       // Queue<myQueue>  = new Queue<>();
        myQueue queue = new myQueue();
        System.out.println("Test 1");
        for (int i = 0; i <= 100; i++) {
            System.out.println("PUT " + queue.put(i));
        }
        for (int i = 0; i < 100; i++){
            System.out.println("GET " + queue.get());
        }
       // System.out.println("Test 2");
        //for (int i = 1; i <= 300; i++){
         //   boolean stored = queue.put(i);
         //   Object retrieved = queue.get();
          //  System.out.println("Put " +  i + " Success " + stored + " Got: " + retrieved);
        //}
    }
}



