public class Start {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalName= "Scar";

        animal.intensity = "low";
        animal.animalSound();   //roarrrrrr

        System.out.println("----------------------------");

        animal.intensity = "medium";
        animal.animalSound();   //cannot reproduce it properly
    }
}
