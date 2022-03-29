package main.java.com.poyrazaktas.multi_thread_safe_singleton_object_pool_pattern;

import java.util.Date;

public class Car {
    private int id;
    private String rentedBy;
    private Date rentDate;
    private Date returnDate;


    public Car(int id) {
        this.id = id;
    }

    public String getRentedBy() {
        return rentedBy;
    }

    public void setRentedBy(String rentedBy) {
        this.rentedBy = rentedBy;
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

}
