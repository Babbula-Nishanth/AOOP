import java.util.HashMap;
import java.util.Map;

class ContactManager {
    private Map<String, String> contacts;

    public ContactManager() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added: " + name + " -> " + phoneNumber);
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public String getPhoneNumber(String name) {
        if (contacts.containsKey(name)) {
            return contacts.get(name);
        } else {
            return "Contact not found: " + name;
        }
    }

    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts List:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        contactManager.addContact("John Doe", "555-1234");
        contactManager.addContact("Alice Smith", "555-5678");
        contactManager.addContact("Bob Johnson", "555-8765");

        contactManager.displayAllContacts();

        System.out.println("Phone number of Alice Smith: " + contactManager.getPhoneNumber("Alice Smith"));

        contactManager.removeContact("John Doe");

        contactManager.displayAllContacts();

        System.out.println("Phone number of John Doe: " + contactManager.getPhoneNumber("John Doe"));
    }
}
