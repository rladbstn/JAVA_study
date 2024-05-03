// 115 다형성
package org.opentutorials.javatutorials.polymorphism;

class o{
    public void a (int param){
        System.out.println("숫자출력");
        System.out.println(param);
    }

    public void a (String param){
        System.out.println("문자출력");
        System.out.println(param);
    }
}

public class PolymorphismOverloadingDemo {
    public static void main(String[] args) {
        o q = new o();
        q.a(1);
        q.a("one");
    }
}
