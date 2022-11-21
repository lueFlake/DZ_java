package org.example;

import java.util.ArrayList;

public class Executive extends Manager {

    public Executive(String name, ArrayList<Employee> subordinates) {
        super(name, subordinates);
    }

    public ArrayList<Employee> getAll() {
        var all = new ArrayList<Employee>();
        for (var sub : subordinates) {
            all.add(sub);
            if (sub instanceof Manager m) {
                all.addAll(m.getSubordinates());
            }
        }
        return all;
    }
}
