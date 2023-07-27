package OOPS.src.Encapsulation;

import java.util.Scanner;
// Encapsulation Demostration
public class UserEncapsulationDemo {
    // Class variables
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userPhoneNumber;

    // Getter Setters
    public String getUserEmail() {
        return userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }
    // Driver Code
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        UserEncapsulationDemo user01 = new UserEncapsulationDemo();
        System.out.println("Enter User Name");
        user01.setUserName(scan.nextLine());
        System.out.println("Enter User Password");
        user01.setUserPassword(scan.nextLine());
        System.out.println("Enter User Email");
        user01.setUserEmail(scan.nextLine());
        System.out.println("Enter User Phone Number");
        user01.setUserPhoneNumber(scan.nextLine());
        System.out.println();


        System.out.println("User Registered successfully");
        System.out.println(user01.getUserName());
        System.out.println(user01.getUserEmail());
        System.out.println(user01.getUserPhoneNumber());
    }

}
