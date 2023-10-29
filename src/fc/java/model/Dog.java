package fc.java.model;

public class Dog extends Animal{
    public Dog(){
        super(); // new Animal() 첫머리에 와야함. 부모가 만들어지기 전에 수행문을 적을 수 없음.
        //int a=10; //수행문
    }
    //public void eat() {
        //System.out.println("개처럼 먹다");
    //}
    // 재정의(Override)
    public void eat(){
        System.out.println("개처럼 먹다");
    }
}
