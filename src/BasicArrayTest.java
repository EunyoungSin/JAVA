public class BasicArrayTest {
    public static void main(String[] args) {
        float[] f={24.5f, 45.6f, 77.65f};
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);

        Book[] b=new Book[3];
        b[0]=new Book();
        b[0].title="자바";
        b[0].price=30000;
        b[0].company="한빛";
        b[0].author="박매일";
        b[0].page=500;
        b[0].isbn="11889900";

        b[1]=new Book();
        b[1].title="오라클";
        b[1].price=30000;
        b[1].company="한빛";
        b[1].author="박매일";
        b[1].page=500;
        b[1].isbn="11889900";

        b[2]=new Book();
        b[2].title="인공지능";
        b[2].price=30000;
        b[2].company="한빛";
        b[2].author="박매일";
        b[2].page=500;
        b[2].isbn="11889900";

        for(int i=0; i<b.length; i++){
            System.out.println(b[i].title+"\t"+b[i].price+"\t"+b[i].company+"\t"+b[i].author+"\t"+b[i].page+"\t"+b[i].isbn);
        }
    }
}
