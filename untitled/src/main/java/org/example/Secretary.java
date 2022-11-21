package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Secretary extends Employee {
    private final Manager manager;
    private int totalCandidates;

    protected ArrayList<Employee> candidates;

    public Secretary(String name, Manager manager) {
        super(name);
        this.manager = manager;
        candidates = new ArrayList<>();
        totalCandidates = 0;
    }

    @Override
    public void doWork() {
        var rng = new Random();
        for (var candidate : candidates) {
            boolean validate = rng.nextBoolean();
            if (validate) {
                manager.subordinates.add(candidate);
            }
        }
        candidates.clear();
    }

    public void addCandidate(Employee employee) {
        candidates.add(employee);
        totalCandidates++;
    }

    public int getTotalCandidates() {
        return totalCandidates;
    }

    @Override
    public String toString() {
        return super.toString() + "\t candidates checked: " + totalCandidates;
    }
}
