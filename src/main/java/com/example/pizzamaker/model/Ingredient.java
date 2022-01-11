package com.example.pizzamaker.model;

import java.util.Objects;

public class Ingredient {
    private int id;
    private String name;
    private boolean editable;

    public Ingredient() {
    }

    public Ingredient(int id, String name, boolean editable) {
        this.id = id;
        this.name = name;
        this.editable = editable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return id == that.id && editable == that.editable && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, editable);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", editable=" + editable +
                '}';
    }
}
