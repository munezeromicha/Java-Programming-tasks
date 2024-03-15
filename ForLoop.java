import java.swing.JOptionPane;
public class ForLoop {
    static int a;
    public static void getNumbers(){
        javax.swing.JOptionPane p=new JOptionPane();
        a=Integer.parseInt(p.showInputDialog(""));
    }
    public static void evenNumbers(){
        for(int i=0; i<a; i++){
            if((i==1)&&(i%2 == 0)){
                System.out.print(i);
            }else if((i==a) && (i%2 != 0)){
                continue;
            }else if(i%2 == 0){
                System.out.print(i+",");
            }
        }
    }
}