
class AddressBookController {
    private AddressBookModel model;
    private AddressBookView view;

    public AddressBookController(AddressBookModel model, AddressBookView view) {
        this.model = model;
        this.view = view;
    }
    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber, phoneNumber);
        model.addContact(contact);
    }

    public void updateView() {
        view.displayContacts(model.getAllContacts());
    }
}
