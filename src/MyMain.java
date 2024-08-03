import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first name");
        String firstName = scanner.next();
        System.out.println("enter last name");
        String lastName = scanner.next();

        UserName userName = new UserName();
        userName.setFirstName(firstName);
        userName.setLastName(lastName);
        System.out.println("Full Name = " + userName.fullName());
        int noOfVowels = MyUtility.countVowel(userName);
        System.out.println("noOfVowels = " + noOfVowels);
    }
}
