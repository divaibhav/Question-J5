package design.two;

public class Employee {
    private String name;
    private String email;
    private String panCard;
    private String mobile;
    private Address permanent;
    private Address present;
    private Address communication;

    private Employee(){

    }

    public Employee(String name, String email, String panCard, String mobile, Address permanent, Address present, Address communication) {
        this.name = name;
        this.email = email;
        this.panCard = panCard;
        this.mobile = mobile;
        this.permanent = permanent;
        this.present = present;
        this.communication = communication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getPermanent() {
        return permanent;
    }

    public void setPermanent(Address permanent) {
        this.permanent = permanent;
    }

    public Address getPresent() {
        return present;
    }

    public void setPresent(Address present) {
        this.present = present;
    }

    public Address getCommunication() {
        return communication;
    }

    public void setCommunication(Address communication) {
        this.communication = communication;
    }
}
