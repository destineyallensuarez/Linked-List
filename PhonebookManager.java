// Programmer: Destiney Allen-Suarez
// Source: DD/W3school/ChatGBT
// Class: CS142
// Purpose:The purpose of the `PhonebookManager` class is to manage the entries in the phone book.
// It provides methods to add, modify, delete, and print entries, as well as potentially sorting them. 
// Essentially, it acts as the interface through which users can interact with the phone book, 
// allowing for easy manipulation and organization of contacts.

public class PhonebookManager {
    private ListNode head; // Reference to the head of the linked list

    // Method to add an entry to the phone book
    public void addEntry(String name, String address, String city, String phoneNumber) {
        ListNode newNode = new ListNode(name, address, city, phoneNumber);
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            ListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext(); // Traverse the list to find the last node
            }
            current.setNext(newNode); // Append the new node to the end of the list
        }
    }

    // Method to sort the entries in the phone book alphabetically by last name
    public void sortEntries() {
        if (head == null || head.getNext() == null) {
            return; // If the list is empty or has only one node, it's already sorted
        }
        boolean swapped;
        do {
            swapped = false;
            ListNode current = head;
            ListNode previous = null;

            while (current.getNext() != null) {
                ListNode nextNode = current.getNext();
                String currentLastName = getLastName(current.getName());
                String nextLastName = getLastName(nextNode.getName());

                if (currentLastName.compareToIgnoreCase(nextLastName) > 0) {
                    if (previous != null) {
                        previous.setNext(nextNode); // Adjust pointers to swap nodes
                    } else {
                        head = nextNode;
                    }
                    current.setNext(nextNode.getNext());
                    nextNode.setNext(current);
                    swapped = true; // Mark that a swap has occurred
                }
                previous = current;
                current = nextNode;
            }
        } while (swapped); // Continue until no more swaps are needed
    }

    // Utility method to extract the last name from a full name string
    private String getLastName(String fullName) {
        String[] nameParts = fullName.split(" ");
        return nameParts[nameParts.length - 1]; // Return the last element of the split array
    }

    // Method to modify an existing entry in the phone book
    public void modifyEntry(String name, String newAddress, String newCity, String newPhoneNumber) {
        ListNode current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
            // Modify the entry
            current.setAddress(newAddress);
            current.setCity(newCity);
            current.setPhoneNumber(newPhoneNumber);
            return;
        }
        current = current.getNext();
    }
        // If the entry with the given name doesn't exist
        System.out.println("Entry not found: " + name);
    }

    // Method to delete an entry from the phone book
    public void deleteEntry(String name) {
        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
         if (current.getName().equals(name)) {
            if (previous != null) {
                // If the node to be deleted is not the head
                previous.setNext(current.getNext());
            } else {
                // If the node to be deleted is the head
                head = current.getNext();
            }
            return;
        }
        previous = current;
        current = current.getNext();
    }
    // If the entry with the given name doesn't exist
    System.out.println("Entry not found: " + name);
    }

    // Method to move an entry from one phone book to another (optional)
    public void moveEntry(String name, PhonebookManager destinationPhonebook) {
        ListNode current = head;
        ListNode previous = null;
        
        while (current != null) {
            if (current.getName().equals(name)) {
                // Remove the current node from the current phone book
                if (previous != null) {
                    // If the node to be deleted is not the head
                    previous.setNext(current.getNext());
                } else {
                    // If the node to be deleted is the head
                    head = current.getNext();
                }
                
                // Add the removed node to the destination phone book
                destinationPhonebook.addEntry(current.getName(), current.getAddress(), current.getCity(), current.getPhoneNumber());
                
                return; // Exit the loop after moving the entry
            }
            
            previous = current;
            current = current.getNext();
        }
        
        // If the entry with the given name doesn't exist in the current phone book
        System.out.println("Entry not found: " + name);
    }

    // Method to print the phone book
    public void printPhonebook() {
        ListNode current = head;
        System.out.println("Phonebook Entries:");
        while (current != null) {
            System.out.println("Name: " + current.getName());
            System.out.println("Address: " + current.getAddress());
            System.out.println("City: " + current.getCity());
            System.out.println("Phone Number: " + current.getPhoneNumber());
            System.out.println("-------------------------");
            current = current.getNext();
        }
    }
}
