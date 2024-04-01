package oop;

public class Parrot extends Pet {

    private String color;
    public Parrot (String age, String breed, String possibleIllnesses, String name, String color){
        super( age,  breed,  possibleIllnesses,  name);
        this.color = color;
    }

    public void Eat(){
        System.out.println( getName() + " is eating worms, cause it is a bird ....");
    }

    public void Fly(){
        System.out.println( getName() + " is flying, cause it is a bird and not a fish!");
    }
}
