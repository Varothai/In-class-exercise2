public class Duck extends Animal implements Flyable{
    void sound() {
        System.out.println("Quack quack!");
    }

    public void fly() {
        System.out.println("Ped bin");
    } 

    public void glide() {
        System.out.println("Ped ron");
    }

    public void clean(Animal animal) {
        System.out.println(animal + " is being cleaned.");
    }

}
