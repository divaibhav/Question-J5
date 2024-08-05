package design.two;

public class MyUtility {
    public static boolean isValidAddress(Address address){
        boolean response = false;
        if(address.getPinCode() >= 99999
                && address.getPinCode() <= 1000000
                    && address.getFlatNumber() >=1 ){
            response = true;
        }
        return response;
    }

    public boolean isValidPanCard(Employee employee){
        boolean response = false;
        String nameInitial = "" + employee.getName().charAt(0);
        if(employee.getPanCard().length() == 10
                && isValidChar(employee.getPanCard(), "p", 3)
                && isValidChar(employee.getPanCard(), nameInitial, 4 )){
            response = true;
        }
        return response;
    }

    private boolean isValidChar(String panCard, String validCharacter, int index) {
        boolean response = false;
        String panCard4thChar = "" + panCard.charAt(index);
        response = validCharacter.equalsIgnoreCase(panCard4thChar);
        return response;
    }
}
