import java.util.List;

class AddressBookView {
    public void displayContacts(List<Contact> contacts) {
        System.out.println("Address Book:");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone: " + contact.getPhoneNumber());
            System.out.println();
        }
    }
}
