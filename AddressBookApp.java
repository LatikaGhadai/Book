public class AddressBookApp {
    public static void main(String[] args) {
        AddressBookModel model = new AddressBookModel();
        AddressBookView view = new AddressBookView();
        AddressBookController controller = new AddressBookController(model, view);

        controller.addContact("John Doe", "123-456-7890");
        controller.addContact("Jane Smith", "987-654-3210");

        controller.updateView();
    }
}
