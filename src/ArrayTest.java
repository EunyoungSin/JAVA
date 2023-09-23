public class ArrayTest {
    public static void main(String[] args) {
        float[] f=new float[5];
        f[0]=10.5f;
        f[1]=15.5f;
        f[2]=50.5f;
        f[3]=70.5f;
        f[4]=88.5f;
        for(int i=0; i<f.length; i++) {
            System.out.println(f[i]);
        }

        int[] a={10,20,30,40,50};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int sum=a[0]+a[3];
        System.out.println("sum = " + sum);
        System.out.println(a.length);

        float[] b=new float[3];
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        int[] c={10,20,30,40,50};
    }
}
