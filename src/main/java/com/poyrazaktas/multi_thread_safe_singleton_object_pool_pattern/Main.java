package main.java.com.poyrazaktas.multi_thread_safe_singleton_object_pool_pattern;

public class Main{
    public static void main(String[] args) {
        // for içinde yapabilirsin

        Client t1 = new Client("t1");
        Client t2 = new Client("t2");
        Client t3 = new Client("t3");
        Client t4 = new Client("t4");
        Client t5 = new Client("t5");
        Client t6 = new Client("t6");
        Client t7 = new Client("t7");
        Client t8 = new Client("t8");
        Client t9 = new Client("t9");
        Client t10 = new Client("t10");
        Client t11 = new Client("t11");
        Client t12 = new Client("t12");
        Client t13 = new Client("t13");
        Client t14 = new Client("t14");
        Client t15 = new Client("t15");


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        if (t1.thread.isAlive()){
            System.out.println("alive t1");
        }
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();



    }
}
