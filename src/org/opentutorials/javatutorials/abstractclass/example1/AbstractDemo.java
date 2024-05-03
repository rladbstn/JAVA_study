//108 추상클래스
package org.opentutorials.javatutorials.abstractclass.example1;

abstract  class A{
    public abstract void b();

    public void d(){
        System.out.println("world");
    }
}

class B extends A{
    public void b(){
       System.out.println("1");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        //A obj = new A();
        B obj = new B();
        obj.b();
    }
}
