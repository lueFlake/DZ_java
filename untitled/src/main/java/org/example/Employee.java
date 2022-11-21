package org.example;

public abstract class Employee {
    protected String name;

    public String getName() {
        return name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public abstract void doWork();

    @Override
    public String toString() {
        return name + ", \t" + super.getClass().getSimpleName();
    }
}
