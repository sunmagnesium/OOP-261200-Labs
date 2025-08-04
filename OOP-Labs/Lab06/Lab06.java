public class Lab06 {
    public static void main(String[] args) {

        Shark shark = new Shark();
        SurgeonFish surgeonFish = new SurgeonFish();
        FlyingShark flyingShark = new FlyingShark();
        Insect insect = new Insect();

        // Dynamic polymorphism (runtime)
        shark.eat(surgeonFish);   // Shark eating SurgeonFish
        shark.eat(new Shark());   // Shark eating Shark

        // Static polymorphism (compile-time overloading)
        flyingShark.eat(new Shark()); // FlyingShark eating Shark
        flyingShark.eat(insect);      // FlyingShark caught flying creature

        // Polymorphic assignments
        Fish fish = new Shark();        // Shark IS-A Fish
        Flyable flyer = new FlyingShark(); // FlyingShark IS-A Flyable

        fish.swim();   // Shark’s swim()
        flyer.fly();   // FlyingShark’s fly()
    }
}
