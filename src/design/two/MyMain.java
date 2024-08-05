package design.two;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Address permanent = new Address();

        System.out.println("Enter flat no");
        int flatNumber = scanner.nextInt();
        permanent.setFlatNumber(flatNumber);

        System.out.println("enter building name");
        String buildingName = scanner.nextLine();
        //permanent.setBuildingName(builingName);



    }
}
