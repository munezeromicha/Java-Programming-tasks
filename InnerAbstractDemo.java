abstract class AbstractDemo {
    public abstract int sum(int a, int b);
    public void End(){
        System.out.println("Well done!!!\n-------------");
    }
}
class MainAbstract extends AbstractDemo{
    public int sum(int a, int b){
        return a + b;
    }
}
/**
 * InnerAbstractDemo
 */
class InnerAbstractDemo{
    public static void main(String[] args){
        MainAbstract ma = new MainAbstract();
        System.out.println("Sum=" + ma.sum(10,20));
        ma.End();
        AbstractDemo ad = new MainAbstract();
        System.out.println("Sum2 =" + ad.sum(30,10));
        ad.End();
    }
}
