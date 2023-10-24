package atu.ie;

import java.util.Scanner;

public class main {
    Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        student s1 = new student();


        System.out.println("Please enter student name: ");
        s1.sname = scanner.nextLine();
        System.out.println("\nPlease enter student email: ");
        s1.semail = scanner.nextLine();
        System.out.println("\nPlease enter student course: ");
        s1.scourse = scanner.nextLine();

        s1.getSname();

        s1.display();
    }
}