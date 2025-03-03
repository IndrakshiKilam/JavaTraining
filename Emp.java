package com.test;
import java.util.*; 
import java.util.stream.Collectors;

public class Emp {

    private int id;
    private String name;
    private int age;
    private String gender;
    private int yearOfJoining;
    private double salary;


    public Emp(int id, String name, int age, String gender, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

  
    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    @Override
    public String toString() {
        return id + "  " + name + "  " + age + "  " + gender + "  " + yearOfJoining + "  " + salary;}



    public static void main(String[] args) {
        List<Emp> employees = Arrays.asList(
            new Emp(1, "Aliya", 25, "Female", 2019, 50000),
            new Emp(2, "Ram", 35, "Male", 2022, 70000),
            new Emp(4, "Raj", 42, "Male", 2018, 55000),
            new Emp(5, "Eisha", 29, "Female", 2023, 75000)
        );

        
        char startChar = 'A';
        System.out.println("Employees with names starting with '" + startChar + "':");
        employees.stream()
                .filter(e -> e.getName().startsWith(String.valueOf(startChar)))
                .forEach(System.out::println);

        System.out.println("\nEmployees who joined after 2020:");
        employees.stream()
                .filter(e -> e.getYearOfJoining() > 2020)
                .forEach(System.out::println);

   
        List<Emp> sortedList = employees.stream()
                .filter(e -> e.getYearOfJoining() > 2020)
                .sorted(Comparator.comparingInt(Emp::getYearOfJoining))
                .collect(Collectors.toList());

        System.out.println("\nSorted list of employees who joined after 2020:");
        sortedList.forEach(System.out::println);
    }
}
