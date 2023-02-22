//classe "Animal"
public class Animal {
    String animalName;
    String intensity;
    //metodo con le stringhe
    public void animalSound(String intensity){
        System.out.println("Animal sound is roarrr");
        if (intensity.equals("hight")){
            System.out.println("ROARRRR");
        }else if (intensity.equals("low")){
            System.out.println("roarrrrrr");
        }else {
            System.out.println("Cannot reproduce it properly");
        }

        //metodo con i numeri
        //int intensity;
    /*public void animalSound(){
        System.out.println("Animal sound is roarrr");
        if (intensity > 10){
            System.out.println("ROARRRR");
        }else if (intensity<5 && intensity>1){
            System.out.println("roarrrrrr");
        }else if (intensity == 0){
            System.out.println("Cannot reproduce it properly");
        }
    }*/
    }
}
