package test3;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }
    public void feed(Animal animal,Food food){
        System.out.println("master "+ name +" give "+animal.getName()+" feed "+food.getName());
    }
}
