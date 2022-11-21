package org.example;

public class Programmer extends Employee implements Gradable {
    protected Integer linesOfCode;
    private Integer totalLines;
    private int grade;

    public Programmer(String name, Integer linesOfCode) {
        super(name);
        this.linesOfCode = linesOfCode;
        this.totalLines = 0;
        grade = 1;
    }

    @Override
    public void doWork() {
        totalLines += linesOfCode;
    }

    public Integer getTotalLines() {
        return totalLines;
    }

    @Override
    public String toString() {
        return super.toString() + "\t lines done: " + totalLines;
    }


    @Override
    public int getGrade() {
        return grade;
    }

    @Override
    public void levelGrade() {
        grade++;
        if (grade > 3) {
            grade = 3;
        }
    }

    @Override
    public int getSalaryUsingGrade() throws UnsupportedOperationException {
        switch (grade) {
            case 1:
                return 80000;
            case 2:
                return 100000;
            case 3:
                return 120000;
        }
        throw new UnsupportedOperationException();
    }
}
