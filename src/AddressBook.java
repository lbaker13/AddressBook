import java.util.*;


public class AddressBook {
    private ArrayList<BuddyInfo> buddies;


    public AddressBook() {
        buddies = new ArrayList<>();
    }


    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }


    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddies.size()) {
            return buddies.remove(index);
        }
        return null;
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "123 Carleton Drive", "123-456-7890");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}