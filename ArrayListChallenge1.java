import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChallenge1 {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myMobilePhone = new MobilePhone();

    public static void showMenu() {
        System.out.println("Enter 1 To Add New Contact.");
        System.out.println("Enter 2 To Remove A Contact.");
        System.out.println("Enter 3 To Modify A Contact.");
        System.out.println("Enter 4 To Print All Of Your Contact.");
        System.out.println("Enter 5 To View This Menu.");
        System.out.println("Enter -1 To Exit.");
    }

    public static void main(String[] args) {
        boolean flag = true;
        showMenu();
        while (flag) {
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 1:
                    System.out.print("Enter The Name Of The Contact: ");
                    String newContactName = scanner.nextLine();
                    System.out.print("Enter Mobile Number Of The Contact: ");
                    long newContactNumber = scanner.nextLong();
                    scanner.nextLine();
                    myMobilePhone.createNewContact(newContactName, newContactNumber);
                    break;

                case 2:
                    System.out.print("Enter The Name Or Number Of The Contact You Want To Remove: ");
                    if (scanner.hasNextLong()) {
                        long contactToBeRemovedPhoneNumber = scanner.nextLong();
                        scanner.nextLine();
                        myMobilePhone.removeContact(contactToBeRemovedPhoneNumber);
                    } else {
                        String contactToBeRemovedName = scanner.nextLine();
                        myMobilePhone.removeContact(contactToBeRemovedName);
                    }
                    break;

                case 3:
                    System.out.print("Enter The Existing Name Or Number Of The Contact You Want To Modify: ");
                    if (scanner.hasNextLong()) {
                        long oldPhoneNumber = scanner.nextLong();
                        scanner.nextLine();
                        System.out.print("Enter The New Name Or Number Of The Contact: ");
                        if (scanner.hasNextLong()) {
                            long modifiedPhoneNumber = scanner.nextLong();
                            scanner.nextLine();
                            myMobilePhone.updateExistingContact(oldPhoneNumber, modifiedPhoneNumber);
                        } else {
                            String modifiedName = scanner.nextLine();
                            myMobilePhone.updateExistingContact(oldPhoneNumber, modifiedName);
                        }
                    } else {
                        String oldName = scanner.nextLine();
                        System.out.print("Enter The New Name Or Number Of The Contact: ");
                        if (scanner.hasNextLong()) {
                            long modifiedPhoneNumber = scanner.nextLong();
                            scanner.nextLine();
                            myMobilePhone.updateExistingContact(oldName, modifiedPhoneNumber);
                        } else {
                            String modifiedName = scanner.nextLine();
                            myMobilePhone.updateExistingContact(oldName, modifiedName);
                        }
                    }
                    break;

                case 4:
                    myMobilePhone.displayContactsList();
                    break;

                case 5:
                    showMenu();
                    break;

                default:
                    flag = false;
                    break;
            }
        }
    }
}

class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void createNewContact(String name, long phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        contacts.add(newContact);
    }

    public void displayContactsList() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". Name - " + contacts.get(i).getName() + ", Phone Number - "
                    + contacts.get(i).getPhoneNumber());
        }
    }

    private void updateExistingContact(Contact contact, String modifiedName, long modifiedPhoneNumber) {
        contact.setName(modifiedName);
        contact.setPhoneNumber(modifiedPhoneNumber);
    }

    public void updateExistingContact(String oldName, String modifiedName) {
        Contact contactToBeUpdated = searchContact(oldName);
        if (contactToBeUpdated != null) {
            updateExistingContact(contactToBeUpdated, modifiedName, contactToBeUpdated.getPhoneNumber());
        } else {
            System.out.println("Contact Does Not Exist.");
        }

    }

    public void updateExistingContact(String oldName, long modifiedPhoneNumber) {
        Contact contactToBeUpdated = searchContact(oldName);
        if (contactToBeUpdated != null) {
            updateExistingContact(contactToBeUpdated, contactToBeUpdated.getName(), modifiedPhoneNumber);
        } else {
            System.out.println("Contact Does Not Exist.");
        }

    }

    public void updateExistingContact(long oldPhoneNumber, String modifiedName) {
        Contact contactToBeUpdated = searchContact(oldPhoneNumber);
        if (contactToBeUpdated != null) {
            updateExistingContact(contactToBeUpdated, modifiedName, contactToBeUpdated.getPhoneNumber());
        } else {
            System.out.println("Contact Does Not Exist.");
        }

    }

    public void updateExistingContact(long oldPhoneNumber, long modifiedPhoneNumber) {
        Contact contactToBeUpdated = searchContact(oldPhoneNumber);
        if (contactToBeUpdated != null) {
            updateExistingContact(contactToBeUpdated, contactToBeUpdated.getName(), modifiedPhoneNumber);
        } else {
            System.out.println("Contact Does Not Exist.");
        }

    }

    private Contact searchContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return contacts.get(i);
            }
        }
        return null;
    }

    private Contact searchContact(long phoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber() == phoneNumber) {
                return contacts.get(i);
            }
        }

        return null;
    }

    private void removeContact(Contact contact) {
        contacts.remove(contact);
        System.out.println("Contact Has Been Removed.");
    }

    public void removeContact(String name) {
        Contact contactToBeRemoved = searchContact(name);
        if (contactToBeRemoved == null) {
            System.out.println("Contact Does Not Exist.");
            return;
        } else {
            removeContact(contactToBeRemoved);
        }

    }

    public void removeContact(long phoneNumber) {
        Contact contactToBeRemoved = searchContact(phoneNumber);
        if (contactToBeRemoved == null) {
            System.out.println("Contact Does Not Exist.");
            return;
        } else {
            removeContact(contactToBeRemoved);
        }
    }
}

class Contact {
    private String name;
    private long phoneNumber;

    public Contact(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(String name, long phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
