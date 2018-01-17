package MyPack.model;

/**
 * Created by makkhay on 1/17/18.
 */
public class Person {

    private String name;
    private String occupation;

    public Person(String name, String occupation){
        this.name=name;
        this.occupation=occupation;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }





}
