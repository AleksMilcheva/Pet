package oop;

public class Breed {
    private String name;
    private String characteristicks;
    private String possibleIllnesses;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.isEmpty()) {
            this.name = name;
        }
    }
    public String GetCharacteristics(){
        return characteristicks;
    }

}
