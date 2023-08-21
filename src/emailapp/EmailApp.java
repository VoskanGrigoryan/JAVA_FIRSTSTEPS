package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        //TODO Auto-generated method stub

        Email em1 = new Email("John", "Smith");

        //Example how to call methods in Email.java
        em1.setMailBoxCapacity(1000);

        System.out.println(em1.getMailBoxCapacity());
    }
}
