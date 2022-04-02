package main.java.com.poyrazaktas.multi_thread_safe_singleton_object_pool_pattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Car {
    private Integer id;
    private Integer rentedBy;
    private Integer returnedBy;
    private Date rentDate;
    private Date returnDate;
    private List<Integer> listOfTenants=new ArrayList<>();


    public Car(int id) {
        this.id = id;
    }

    public int getRentedBy() {
        return rentedBy;
    }

    public void setRentedBy(int rentedBy) {
        this.rentedBy = rentedBy;
    }

    public int getReturnedBy() {
        return returnedBy;
    }

    public void setReturnedBy(int returnedBy) {
        this.returnedBy = returnedBy;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", rentedBy=" + rentedBy +
                ", returnedBy=" + returnedBy +
                ", rentDate=" + rentDate +
                ", returnDate=" + returnDate +
                ", listOfTenants=" + listOfTenants+
                '}';
    }

    public List<Integer> getListOfTenants() {
        return listOfTenants;
    }

    public void setListOfTenants(List<Integer> listOfTenants) {
        this.listOfTenants = listOfTenants;
    }
}
