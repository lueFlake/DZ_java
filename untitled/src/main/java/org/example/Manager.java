package org.example;

import java.util.Collection;

public class Manager extends Employee implements Gradable {

    protected Collection<Employee> subordinates;
    private int grade;

    public Manager(String name, Collection<Employee> subordinates) {
        super(name);
        if (subordinates.size() > 10) {
            throw new RuntimeException("Слишком много сотрудников.");
        }
        this.subordinates = subordinates;
        grade = 1;
    }

    @Override
    public void doWork() {
        for (var item : subordinates) {
            item.doWork();
        }
    }

    public Collection<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public int getGrade() {
        return grade;
    }

    @Override
    public void levelGrade() {
        grade++;
        if (grade > 4) {
            grade = 4;
        }
    }

    @Override
    public int getSalaryUsingGrade() throws UnsupportedOperationException {
        switch (grade) {
            case 1:
                return 70000;
            case 2:
                return 900000;
            case 3:
                return 100000;
            case 4:
                return 100000;
        }
        throw new UnsupportedOperationException();
    }
}
