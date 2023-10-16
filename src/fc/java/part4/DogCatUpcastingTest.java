package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Upcasting(업캐스팅). 부모가 자식을 가리킨다.
        Animal ani=new Dog();
        ani.eat();

        Animal ani2=new Cat();
        ani2.eat();
    }
}
