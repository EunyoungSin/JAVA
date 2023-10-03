public class BreakContinueTest {
    public static void main(String[] args) {
        char[] c={'s','h','u','t','d','o','w','n'};
        for(int i=0; i<c.length; i++){ // i=지역변수
            if(c[i]=='o') break; // if(c[i]=='o') { break; }와 같음.
            System.out.println(c[i]);
        }
        int count=0;
        for(int i=1; i<=10; i++){
            if(i%3!=0) continue;
                count++;
        }
        System.out.println(count);
    }
}
