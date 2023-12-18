import java.util.ArrayList;
import java.util.List;

class AddressBookModel {
    private List<Contact> contacts;

    public AddressBookModel() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    
}
