package oop;

public class Pet {
    private String age;
    private String name;
    private String breed;
    private String possibleIllnesses;

    public Pet() {

    }
    public Pet(String age, String breed, String possibleIllnesses, String name) {
        this.age = age;
        this.breed = breed;
        this.possibleIllnesses = possibleIllnesses;
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        if (!age.isEmpty()) {
            this.age = age;
        } else {
            System.out.println("ERROR: Invalid entry for age");
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed( String breed) {
        if (!breed.isEmpty()) {
            this.breed = breed;
        } else {
            System.out.println("ERROR: Invalid entry for breed");
        }
    }

    public String getPossibleIllnesses() {
        return possibleIllnesses;
    }

    public void setPossibleIllnesses(String possibleIllnesses) {
        if(!possibleIllnesses.isEmpty()) {
            this.possibleIllnesses = possibleIllnesses;
        } else {
            System.out.println("ERROR: Invalid entry for possible illnesses");
        }
    }

    public void Eat()
    {
        System.out.println( "This pet is eating ....");
    }
}





