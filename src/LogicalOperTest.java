public class LogicalOperTest {
    public static void main(String[] args) {
        int x=1, y=0;
        System.out.println(!(x>0)); // !true = false
        System.out.println(x>0 && x<3); // true
        System.out.println(x>0 && y<0); // t, f => false
        System.out.println(x<0 || y>=0); // f, t => true
        System.out.println(y<0 && y<-5); // f, f => false

        int a=3, b=5;
        System.out.println((a>=3) && (b<6)); // t, t => true
        System.out.println((a!=3) && (a>2)); // t,f => false
        System.out.println((a!=3) || (a>2)); // t,f => true
        System.out.println((b!=5) || (a==1)); // f,f => false
    }
}
