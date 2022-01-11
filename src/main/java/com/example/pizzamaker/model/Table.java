package com.example.pizzamaker.model;

import java.util.Objects;

public class Table {

    private String id;
    private String number;
    private String seats;
    private String busy;

    public Table() {

    }

    public Table(String id, String number, String seats, String busy) {
        this.id = id;
        this.number = number;
        this.seats = seats;
        this.busy = busy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getBusy() {
        return busy;
    }

    public void setBusy(String busy) {
        this.busy = busy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return id.equals(table.id) && number.equals(table.number) && seats.equals(table.seats) && busy.equals(table.busy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, seats, busy);
    }

    @Override
    public String toString() {
        return "Table{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", seats='" + seats + '\'' +
                ", busy='" + busy + '\'' +
                '}';
    }
}
