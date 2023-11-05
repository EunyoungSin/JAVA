package fc.java.poly;

public class Cat extends Animal { // Animal->eat();
    // 재정의를 하지 않음(x) ---> 오류 발생
    // 재정의를 반드시 해야한다. -> 구현해야한다. 바디({   })를 만들면 된다.
    public void night(){
        System.out.println("밤이 되면 눈에서 빛이 난다");
    }

    @Override
    public void eat() {
        System.out.println("고양이처럼 먹다");
    }
}
