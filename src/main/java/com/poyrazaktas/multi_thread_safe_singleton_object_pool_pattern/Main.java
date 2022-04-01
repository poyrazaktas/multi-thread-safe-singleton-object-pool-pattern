package main.java.com.poyrazaktas.multi_thread_safe_singleton_object_pool_pattern;

public class Main {
    public static void main(String[] args) {
        final int numberOfClients = 15;
        for (int i = 1; i <= numberOfClients; i++) {
            Client client = new Client(i);
            client.start();
        }

    }
}
