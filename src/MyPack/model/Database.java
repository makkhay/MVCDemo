package MyPack.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by makkhay on 1/17/18.
 */
public class Database {

    private List<Person> peopleDatabase;


    public Database(){
        this.peopleDatabase = new ArrayList<>();
    }

    public void addPerson(Person person){
        this.peopleDatabase.add(person);
    }

    public void removePerson(Person person){
        this.peopleDatabase.remove(person);
    }

    public List<Person> getPeopleDatabase(){
        return this.peopleDatabase;
    }

}
