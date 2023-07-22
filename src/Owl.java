public class Owl extends Animal implements Flyable {
    @Override
    void sound() {
        System.out.println("Hoot hoot!");
    }

    @Override
    public void fly() {
        System.out.println("Hook bin");
    }

    @Override
    public void glide() {
        System.out.println("Hoot ron");
    }
}
