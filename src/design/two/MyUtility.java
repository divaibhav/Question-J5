package design.two;

public class MyUtility {
    public static boolean isValidAddress(Address address){
        boolean response = false;
        if(address.getPinCode() >= 99999 && address.getPinCode() <= 1000000){
            response = true;
        }
        return response;
    }
}
