package com.stackroute.pe2;

public class Member {
    private String Name;
    private int Age;
    private double Salary;

    public Member(String name, int age, double salary) {
        this.Age = age;
        this.Name = name;
        this.Salary = salary;
    }

    public String details(String name, int age, double salary) {
        if ((Name == name) && (Age == age) && (Salary == salary)) {
            return "The details you entered is correct";
        } else
            return "The details you entered is incorrect";
    }

}

class MemberVariable extends Member {
    public MemberVariable(String name, int age, double salary) {
        super(name, age, salary);
    }
}