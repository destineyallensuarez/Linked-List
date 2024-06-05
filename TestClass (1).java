// Programmer: Destiney Allen-Suarez
// Source: DD/W3school/ChatGBT
// Class: CS142
// Purpose:The `TestClass` is like the control center of your program. It starts everything
// and makes sure everything works smoothly.It's where you put the main instructions to check 
//if your phone book works as expected.

public class TestClass {
        public static void main(String[] args) {
            // Create an instance of PhonebookManager
            PhonebookManager phonebookManager = new PhonebookManager();
    
            // Add entries to the phone book
            phonebookManager.addEntry("John Doe", "123 Main St", "Bellingham", "555-1234");
            phonebookManager.addEntry("Jane Smith", "456 Elm St", "Seattle", "555-5678");
            phonebookManager.addEntry("Alice Johnson", "789 Oak St", "Bellingham", "555-9876");
    
            // Print the phone book before sorting
            System.out.println("Phonebook before sorting:");
            phonebookManager.printPhonebook();
    
            // Sort the phone book
            phonebookManager.sortEntries();
    
            // Print the phone book after sorting
            System.out.println("\nPhonebook after sorting:");
            phonebookManager.printPhonebook();
    
            // Modify an entry
            phonebookManager.modifyEntry("John Doe", "124 Main St", "Bellingham", "555-4321");
    
            // Print the phone book after modification
            System.out.println("\nPhonebook after modifying John Doe's entry:");
            phonebookManager.printPhonebook();
    
            // Delete an entry
            phonebookManager.deleteEntry("Jane Smith");
    
            // Print the phone book after deletion
            System.out.println("\nPhonebook after deleting Jane Smith's entry:");
            phonebookManager.printPhonebook();
        }
    }
    