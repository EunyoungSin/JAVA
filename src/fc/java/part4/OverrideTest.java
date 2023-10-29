package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        // Upcasting(업캐스팅) : Dog.java(X), Animal<--->Dog.class(O)
        Animal g = new Dog();
    }
}
