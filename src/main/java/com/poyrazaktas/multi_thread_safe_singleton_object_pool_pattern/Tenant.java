package main.java.com.poyrazaktas.multi_thread_safe_singleton_object_pool_pattern;

import java.util.Date;

public class Tenant extends Thread {
    private Integer id;
    private final CarPool carPool = CarPool.getCarPool();

    public Tenant(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Car car = rentACar();
            while (car == null) {
                Thread.sleep(5000);
                car = rentACar();
            }
            returnACar(car);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private Car rentACar() {
        Car car = carPool.getCar();
        if(car !=null){
            car.setRentDate(new Date());
            car.setRentedBy(id);
            car.getListOfTenants().add(id);
            System.out.println("Client "+id+" rented: "+car);
        }
        return car;
    }

    private void returnACar(Car car) {
        car.setReturnDate(new Date());
        car.setReturnedBy(id);
        System.out.println("Client "+id+" returned: "+car);
        carPool.releaseCar(car);
    }

}
