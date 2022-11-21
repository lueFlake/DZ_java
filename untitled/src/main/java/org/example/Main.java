package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var firstTeam = new ArrayList<Employee>();
        firstTeam.add(new Programmer("Alex", 10));
        firstTeam.add(new Programmer("Bob", 320));
        firstTeam.add(new Programmer("Alice", 50));
        var firstTeamManager = new Manager("John", firstTeam);
        var firstTeamSecretary = new Secretary("Ivan", firstTeamManager);

        var secondTeam = new ArrayList<Employee>();
        secondTeam.add(new Programmer("Kate", 400));
        secondTeam.add(new Programmer("Ben", 320));
        var secondTeamManager = new Manager("Joe", secondTeam);
        var secondTeamSecretary = new Secretary("Ann", secondTeamManager);

        var executiveTeamsManagers = new ArrayList<Employee>();
        executiveTeamsManagers.add(firstTeamSecretary);
        executiveTeamsManagers.add(secondTeamSecretary);
        executiveTeamsManagers.add(firstTeamManager);
        executiveTeamsManagers.add(secondTeamManager);
        var executive = new Executive("Amogus", executiveTeamsManagers);

        executive.doWork();

        firstTeamSecretary.addCandidate(new Programmer("Vasya", 100));
        secondTeamSecretary.addCandidate(new Programmer("Petya", 200));
        firstTeamSecretary.addCandidate(new Manager("Artem", new ArrayList<>()));

        executive.doWork();

        Gradable firstGradable = (Gradable) secondTeam.get(0);
        Gradable secondGradable = (Gradable) secondTeam.get(1);

        System.out.println(executive);
        for (var employee : executive.getAll()) {
            System.out.println(employee);
        }
    }
}