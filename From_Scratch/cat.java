public class cat extends Animal{
    public void AnimalSound(){
        System.out.println("Myuuuuuuu!");
    }

    public static void main(String[] args){
        Animal object = new cat();
        object.AnimalSound();
        
    }
}