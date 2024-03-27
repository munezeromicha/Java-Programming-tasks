public class Man extends Person {
    public void personAbilities(){
        System.out.println("Every person must Walk!");
    }
    public static void main(String[] args){
        Person identification = new Man();
        identification.personAbilities();
    }
}
