package FullNameGenerator;

//import scanner class
import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        // creating a scanner
        Scanner scanner = new Scanner(System.in);


        // This is where I inform the user what to do
        System.out.println("Please fill out your full name, including suffix. ");

        System.out.println("First Name");
        String name = scanner.nextLine();

        //Need to find how to make it optional to show
        System.out.println("Middle Name");
        String middleName = scanner.nextLine();

        System.out.println("Last Name");
        String lastName = scanner.nextLine();

        //Need to find how to make it optional to show
        System.out.println("Suffix");
        String suffix = scanner.nextLine();

        System.out.println("My name is " + name +" " + middleName + " " + lastName + " " + suffix);




        // close the scanner
        scanner.close();



        // Input: First Name, Middle Name, Last Name, suffix
        // If there is a suffix, there must be a comma before the suffix and the name
        // trim anny leading or trailing spaces that the user may have entered


    }




}
