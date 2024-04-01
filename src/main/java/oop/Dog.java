package oop;

public class Dog extends Pet {

    @Override
    public void Eat() {
        System.out.println( "My name is "+getName()+"I'm eating meat, I'm a dog!!!!");
    }

    public Dog(String name){
        super("","","",name);
    }
}
