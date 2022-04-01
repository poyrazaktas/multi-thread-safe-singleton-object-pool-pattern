package main.java.com.poyrazaktas.multi_thread_safe_singleton_object_pool_pattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarPool {
    private final int carCount = 10;

    private static volatile CarPool pool = null;
    private static final List<Car> available = new ArrayList<>();
    private static final List<Car> inUse = new ArrayList<>();

    private CarPool() {
        initCarPool();

    }

    private void initCarPool() {
        for (int i = 1; i <= carCount; i++) {
            available.add(new Car(i));
        }
    }

    public static CarPool getCarPool() {
        if (pool == null) {
            synchronized (CarPool.class) {
                if (pool == null) {
                    pool = new CarPool();
                }
            }
        }
        return pool;
    }

    // rent a car burada get -> client'te rent a car
    // return a car release -> returnTheCar
    // metotları client tarafında olsa mantıklı

    public Car rentACar() {
        synchronized (available) {
            if (available.size() != 0) {
                Car car = available.get(0);
                car.setRentDate(new Date());
                inUse.add(car);
                available.remove(0);
                return car;
            } else {
                throw new RuntimeException("No pickers are available!");
            }
        }
    }

    public void returnTheCar(Car car) {
        synchronized (available) {
            available.add(car);
            inUse.remove(car);
        }
    }

    @Override
    public String toString() {
        return "Available cars: " + available.size() + "\nCars in use: " + inUse.size() + "\n---------------------";
    }
}
