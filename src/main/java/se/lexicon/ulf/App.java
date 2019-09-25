package se.lexicon.ulf;

import se.lexicon.ulf.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Person> people = new ArrayList<Person>();

        people.add(new Person("Åsa","Alssing",52));
        people.add(new Person("Ulla","Bengtsson",37));
        people.add(new Person("Erik","Svensson",42));
        people.add(new Person("Ulf","Bengtsson",37));
        people.add(new Person("Kent","Gudmendsen",82));
        people.add(new Person("Adam","Alssing",52));
        people.add(new Person("Zena","Svensson",52));

        people.stream().forEach(System.out::println);

        Collections.sort(people);

        System.out.println("----------------------------------------");

        people.stream().forEach(System.out::println);
    }
}
