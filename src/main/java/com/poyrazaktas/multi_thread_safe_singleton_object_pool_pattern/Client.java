package main.java.com.poyrazaktas.multi_thread_safe_singleton_object_pool_pattern;

// implements runnable yerine extends thread

public class Client implements Runnable{
    public Thread thread;
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // car pool durumunu sout
        // car rent
        // rent edemezse
        // thread sleep
        //while(true = null){
            // sleep;
            //rent again
        //}
        // car return
        CarPool carPool = CarPool.getCarPool();
        carPool.rentACar();
        System.out.println(carPool);
    }

    public void start(){
        System.out.println(name + " started!");
        if (thread==null){
            thread = new Thread(this,name);
            thread.start();
        }
    }

}
