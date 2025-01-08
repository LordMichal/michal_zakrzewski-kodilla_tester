package com.kodilla.execution_model.homework;

import java.util.Objects;

public class Order {
    private double value;
    private String date;
    private String userLogin;

    public Order(double value, String date, String userLogin) {
        this.value = value;
        this.date = date;
        this.userLogin = userLogin;
    }
    public double getValue(){
        return value;
    }
    public String getUserLogin(){
        return userLogin;
    }
    public String getDate(){
        return date;
    }
//    @Override
//    public boolean equals(Objects o){
//        if (this == o) return true;
//        if (o == null || getClass() !=o.getClass()) return false;
//        Order order = (Order) o;
//        return Double.compare (value, order.value) == o && Objects.equals(date, order.date) && Objects.equals(userLogin, order.userLogin);
//    }
    @Override
    public int hashCode(){
        return Objects.hash(value,date, userLogin);
    }
}
