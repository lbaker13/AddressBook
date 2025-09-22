public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;


    public BuddyInfo(String name, String address, String n) {
        this.name = name;
        this.address = address;
        this.phoneNumber = n;
    }


    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    // default constructor
    public BuddyInfo(){
        this("Name", "Address", "000-000-0000");
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "123 Carleton Drive", "123-456-7890");
        System.out.println("Hello " + buddy.getName() + ", Address: " + buddy.getAddress() + ", Phone Number: " + buddy.getPhoneNumber());
    }
}