public class Start {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalName= "Scar";

        animal.animalSound("hight");   //ROARRRR

        System.out.println("----------------------------");

        animal.animalSound("low");   //roarrrrrr

        System.out.println("----------------------------");

        animal.animalSound("medium");   //cannot reproduce it properly
    }
}
