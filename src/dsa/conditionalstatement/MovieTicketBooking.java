package dsa.conditionalstatement;

import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {

        System.out.println("Movie Ticket Booking System");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();

        if (age < 5) {
            System.out.println("Free ticket");
        } else if (age >= 5 && age < 18) {
            System.out.println("Half ticket price");

        } else {
            System.out.println("Full ticket price");
        }
    }
}
