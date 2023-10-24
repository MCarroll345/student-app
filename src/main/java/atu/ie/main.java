package atu.ie;

import java.util.Scanner;

public class main {
    Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        student s1 = new student();


        System.out.println("Please enter student name: ");
        s1.setSname(scanner.nextLine());
        System.out.println("\nPlease enter student email: ");
        s1.setSemail(scanner.nextLine());
        System.out.println("\nPlease enter student course: ");
        s1.setScourse(scanner.nextLine());

        String name2;
        System.out.println("Please enter student name: ");
        name2 = scanner.nextLine();
        student s2 = new student(name2);
        System.out.println("\nPlease enter student email: ");
        s2.setSemail(scanner.nextLine());
        System.out.println("\nPlease enter student course: ");
        s2.setScourse(scanner.nextLine());

        String name3,email3,course3;
        System.out.println("Please enter student name: ");
        name3 = scanner.nextLine();
        System.out.println("\nPlease enter student email: ");
        email3 = scanner.nextLine();
        System.out.println("\nPlease enter student course: ");
        course3 = scanner.nextLine();
        student s3 = new student(name3,email3,course3);

        s1.display();
        s2.display();
        s3.display();

    }
}