package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    //constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Call a method that return a random password
        this.password = randomPassword(8);
        System.out.println("Password is: " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() +  "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    //Ask for the department

    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
        Scanner in = new Scanner(System.in);

        int depChoice = in.nextInt();

        if(depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "development";
        } else if (depChoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&";

        char[] password = new char[length];

        for(int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());

            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }

    //Set mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    //Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() { return mailBoxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }
}
