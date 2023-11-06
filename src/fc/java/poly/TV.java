package fc.java.poly;

//public class TV extends RemoCon{
public class TV implements RemoCon{
    private int currch=10;
    // chUp(), chDown(), volUp(), volDown()
    @Override
    public void chUp() {
        currch++;
        if(currch>RemoCon.MAXCH){
            currch=1;
        }
        System.out.println("TV 채널이 올라간다.");
    }

    @Override
    public void chDown() {
        currch--;
        if(currch<RemoCon.MINCH){
            currch=99;
        }
        System.out.println("TV 채널이 내려간다.");
    }

    @Override
    public void volUp() {
        System.out.println("TV 볼륨이 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("TV 볼륨이 내려간다.");
    }

    @Override
    public void internet() {
        System.out.println("TV에서 인터넷이 실행된다.");
    }
}
