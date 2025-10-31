package Collection;

import java.util.List;
import java.util.Vector;
// import java.util.concurrent.CopyOnWriteArrayList;

public class List_Interface_Vector {
    public static void main(String[] args) throws InterruptedException {
    	
    	// features 
    	// vector = arraylist + synchronized
        List<Integer> list = new Vector<>();

        // Writer thread
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                list.add(i);
                System.out.println("Writer added: " + i);
                try {
                    Thread.sleep(100); // simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Reader thread
        Thread reader = new Thread(() -> {
            for (int j = 0; j < 5; j++) {
                System.out.println("Reader snapshot: " + list);
                try {
                    Thread.sleep(150); // simulate slower reading
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        writer.start();
        reader.start();

        writer.join();
        reader.join();

        System.out.println("Final list: " + list);
    }
}


