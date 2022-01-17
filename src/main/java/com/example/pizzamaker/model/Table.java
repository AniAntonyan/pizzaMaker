package com.example.pizzamaker.model;

import java.util.Objects;

public class Table {

    private int id;
    private int number;
    private int seats;
    private boolean busy;

    public Table() {

    }

    public Table(int id, int number, int seats, boolean busy) {
        this.id = id;
        this.number = number;
        this.seats = seats;
        this.busy = busy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return id == table.id && number == table.number && seats == table.seats && busy == table.busy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, seats, busy);
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", number=" + number +
                ", seats=" + seats +
                ", busy=" + busy +
                '}';
    }
}

