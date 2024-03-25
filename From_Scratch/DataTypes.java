public class DataTypes {
    public void setDataTypes(){
        int num = 2147483647;
        char myChar = 'M';
        long myLong = 9223372036854775807L;
        float myFloat = 19.99f;
        short myShort = 32767;
        double myDouble = -42937737.9d;
        Boolean myBoolean = false;
        
        
        System.out.println(num);
        System.out.println(myLong);
        System.out.println(myShort);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);


    }
    public static void main(String[] args){
       DataTypes object = new DataTypes();
        object.setDataTypes();
    }
}
