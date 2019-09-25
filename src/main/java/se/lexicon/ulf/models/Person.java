package se.lexicon.ulf.models;

public class Person implements Comparable<Person> {
    private static int idCounter = 1;

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age)
    {
        id = idCounter++;

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {

        if (otherPerson == null)
        {
            return 1;
        }

        return firstName.compareTo(otherPerson.firstName);


    }
}
