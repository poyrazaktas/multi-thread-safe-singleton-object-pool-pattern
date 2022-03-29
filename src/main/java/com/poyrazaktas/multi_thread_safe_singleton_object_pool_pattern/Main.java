package main.java.com.poyrazaktas.multi_thread_safe_singleton_object_pool_pattern;

public class Main {
    public static void main(String[] args) {
        CarPool carPool = CarPool.getCarPool();
        Car rentedCar1 = carPool.rentACar();
        Car rentedCar2 = carPool.rentACar();

        System.out.println(carPool.toString());

        CarPool carPool1 = CarPool.getCarPool();

        System.out.println(carPool1.toString());
        carPool1.returnTheCar(rentedCar1);

        System.out.println(carPool.toString());


    }
}
