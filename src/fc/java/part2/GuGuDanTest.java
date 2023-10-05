package fc.java.part2;

public class GuGuDanTest {
    public static void main(String[] args) {
        for(int i=2;i<=9;i++){
            System.out.print(i+"단"+"\t\t");
        }
        System.out.println();
        // 2x1=2    3x1=3   4x1=4 ~ 9x=1=9
        for(int i=1; i<=9; i++) {
            for(int j=2; j<=9; j++) {
                System.out.print(j+"x"+i+"="+(j*i)+"\t\t");
            }
            System.out.println();
        }
    }
}
