package Practice;

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

public class DeepCopyVsShallowCopy {
    public static void main(String[] args) {
        Address originalAddress = new Address("New York");
        Person originalPerson = new Person("John", originalAddress);
        System.out.println(" " + originalPerson.name+","+originalPerson.address.city); // Output: Los Angeles

        // Shallow copy
        Person shallowCopyPerson = new Person(originalPerson.name, originalPerson.address);

        // Deep copy
        Address deepCopyAddress = new Address(originalPerson.address.city);
        Person deepCopyPerson = new Person(originalPerson.name, deepCopyAddress);

        // Modify the city in the original address
        originalAddress.city = "Los Angeles";

        // Displaying values
        System.out.println("Shallow Copy - Address: " + shallowCopyPerson.address.city); // Output: Los Angeles
        System.out.println("Deep Copy - Address: " + deepCopyPerson.address.city); // Output: New York
    }
}