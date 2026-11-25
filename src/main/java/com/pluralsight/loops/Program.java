package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        // creating a collection that stores Person's object
        List<Person> people = new ArrayList<>();

        // create 10 person's objects and adds them to list
        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Maria", "Garcia", 30));
        people.add(new Person("James", "Rodriguez", 22));
        people.add(new Person("Sofia", "Johnson", 28));
        people.add(new Person("Carlos", "Martinez", 35));
        people.add(new Person("Emily", "Lopez", 19));
        people.add(new Person("Daniel", "Williams", 42));
        people.add(new Person("Isabella", "Hernandez", 27));
        people.add(new Person("Miguel", "Brown", 31));
        people.add(new Person("Ashley", "Rivera", 24));

        // import scanne for input
        Scanner peopleScanner = new Scanner(System.in);

        //Ask for name
        System.out.print("Enter a first or last name: ");

        String searchName = peopleScanner.nextLine();

        // create a new list to store matched people
        List<Person> matchingPeople = new ArrayList<>();


        // display all 10 people using for each loop
        for (Person person : people) {

            // check if first name or last name matches
            if (person.getFirstName().equalsIgnoreCase(searchName) || person.getLastName().equalsIgnoreCase(searchName)
            ) {
                matchingPeople.add(person);
            }

        }
        // display for matching people
        System.out.println("\nMatching people:");

        // loop through the new list containing matching people
        for (Person person : matchingPeople) {

            // retrieve and display each person's info
            System.out.println(
                    person.getFirstName() + " " +
                            person.getLastName() + ", Age: " +
                            person.getAge()
            );
        }
        // display if no match is found
        if (matchingPeople.isEmpty()) {
            System.out.println("Match is not found.");
        }
        // close scanner
        peopleScanner.close();

        // calculate the average age of all people
        int totalAge = 0;

        // loop through the original people and add their age towards total
        for (Person person : people) {
            totalAge += person.getAge();
        }

        // calculate and display the average
        double averageAge = (double) totalAge / people.size(); // returns number of people in the list
        System.out.println("Average age: " + averageAge);

        // find the oldest and youngest people
        Person oldest = people.get(0);
        Person youngest = people.get(0);

        // loop through all people to compare their ages
        for (Person person : people) {

            if (person.getAge() > oldest.getAge()) {
                oldest = person;
            }
        }
        //display oldest and youngest people
        System.out.println("Oldest person: " +
                oldest.getFirstName() + " " +
                oldest.getLastName() + ", Age: " +
                oldest.getAge());

        System.out.println("Youngest person: " +
                youngest.getFirstName() + " " +
                youngest.getLastName() + ", Age: " +
                youngest.getAge());

    }
}
