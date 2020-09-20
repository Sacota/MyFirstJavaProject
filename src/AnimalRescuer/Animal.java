package AnimalRescuer;

public class Animal {

    private String name;
    private String color;
    private float age;
    private int helthstatus;
    private int hungri;

    public String getName() {
        return name;
    }

    public void setName(String nameofduck) {
        name = nameofduck;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colorofduck) {
        color = colorofduck;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;

    }

    public int getHelthstatus() {
        return helthstatus;
    }

    public void setHelthstatus(int helthstatus) {
        this.helthstatus = helthstatus;
    }

    public int getHungri() {
        return hungri;
    }

    public void setHungri(int hungri) {
        this.hungri = hungri;
    }

    public void eat() {
        System.out.println("Eating");

    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}
