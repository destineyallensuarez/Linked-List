// Programmer: Destiney Allen-Suarez
// Source: DD/W3school/ChatGBT
// Class: CS142
// Purpose: The ListNode class is like a building block for making a list. It holds 
// information about each entry in the phone book and knows what comes next in the list,
 //making it easy to go through the entries one by one.
// ListNode.java

public class ListNode {
    // Fields to store information about each entry in the phone book
    private String name;
    private String address;
    private String city;
    private String phoneNumber;
    private ListNode next; // Reference to the next node in the linked list

    // Constructor to initialize a new ListNode with the provided data
    public ListNode(String name, String address, String city, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null; // Initially, there is no next node
    }

    // Getters and setters for the fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
