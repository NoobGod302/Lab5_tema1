package Problema1;

import java.util.ArrayList;
import java.util.Scanner;

public class Salariu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti numarul de angajati (N): ");
        int numberOfEmployees = scanner.nextInt();

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nIntroduceti datele pentru angajatul " + (i + 1) + ":");

            System.out.print("Nume: ");
            String name = scanner.next();

            System.out.print("Email: ");
            String email = scanner.next();

            System.out.print("Tarif pe ora: ");
            double hourRate = scanner.nextDouble();

            System.out.print("Capacitate de lucru (ore pe zi): ");
            int capacity = scanner.nextInt();

            System.out.print("Zile libere: ");
            int freeDays = scanner.nextInt();

            employees.add(new Employee(name, email, hourRate, capacity, freeDays));
        }

        System.out.println("\nCalculand salariile lunare pentru " + numberOfEmployees + " angajati:");

        for (Employee employee : employees) {
            double monthlyIncome = employee.calculateMonthlyIncome();
            System.out.println("Angajatul " + employee.getName() + " are un salariu lunar de: " + monthlyIncome);
        }
    }
}
