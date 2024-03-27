public class Brand extends CarBrand {
    public void myBrand(){
        System.out.println("My Car brand is : Dodge" );
    }
    public static void main(String[] args){
     CarBrand object = new Brand();
     object.myBrand();
    }
}
