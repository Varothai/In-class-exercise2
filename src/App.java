public class App {
    public static void main(String[] args) {
        Cow kaow = new Cow();
        kaow.sound();
        Duck donald = new Duck();
        donald.sound();
        Pig piglet = new Pig();
        piglet.sound();
        Owl hedwig = new Owl();
        hedwig.sound();

        donald.fly();
        hedwig.fly();

        donald.clean(new Cow());

        PekingDuck daisy = new PekingDuck();
        daisy.clean(donald);
    }
}
