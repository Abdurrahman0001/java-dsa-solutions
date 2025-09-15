package dsa.basics;

import java.io.Console;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*
        // Console is a class that has many functions that work on console only
        Console console = System.console();
        if (console == null){
            System.out.println("No console available");
            return;
        }
        System.out.println("\t\t\t\t ==== Sign Up ====: ");
        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        // taking password as hidden
        char[] passwordArray = console.readPassword("password: ");
        String password = new String(passwordArray);

        System.out.println("You have entered");
        System.out.println("name "+name+" email "+email+ " password "+password);*/


        //=======================
        int million = 234000000;
        int billion = 234_000_000; //underscore will be ignored by the compiler
        System.out.println(million);
        System.out.println(billion);
        System.out.println("मेरा नाम अब्दुर रहमान है"); // in java all char are in unicode
        double salary = 23.34;

    }
}
