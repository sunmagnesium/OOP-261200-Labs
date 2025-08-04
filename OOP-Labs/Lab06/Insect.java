public class Insect implements Flyable {
    @Override
    public void fly() {
        System.out.println("Insect flying");
    }

    @Override
    public String toString() {
        return "Insect";
    }
}
