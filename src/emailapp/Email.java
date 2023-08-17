package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

    //constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //Call Sa method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    //Ask for the department

    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
        Scanner in = new Scanner(System.in);

        int depChoice = in.nextInt();

        if(depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    //Generate a random password

    //Set mailbox capacity

    //Set the alternate email

    //Change the password
}
