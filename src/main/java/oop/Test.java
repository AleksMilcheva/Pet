package oop;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Parrot papagala_Gosho = new Parrot("2","super papagal","none","Gosho","green");
        Parrot papagala_Genka = new Parrot("23","normal papagal","none","Genka","yellow");
        Cat cat_mila = new Cat();
        Cat cat_betty = new Cat();
        //papagala_Gosho.Eat();
        //papagala_Gosho.Fly();
        //String age = papagala_Gosho.getAge();
        //String breed  = papagala_Gosho.getBreed();
        //System.out.println(papagala_Gosho.getName() + " is " + age + " years old, and it's breed is '"+breed+"'.");

        List<Pet> pets = new ArrayList<>();
        pets.add(papagala_Gosho);
        pets.add(cat_mila);
        pets.add(cat_betty);

        Dog dogMax = new Dog("Max");
        pets.add(dogMax);


        for (Pet currentPet : pets ){
            currentPet.Eat();
        }


        papagala_Genka.Fly();
        papagala_Genka.Eat();
    }
}
