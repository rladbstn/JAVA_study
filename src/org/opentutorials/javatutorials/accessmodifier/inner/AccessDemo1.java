//104 접근 제어자
package org.opentutorials.javatutorials.accessmodifier.inner;


class A{
    public String y(){
        return "public void y()";
    }

    private String z(){
        return "public void z()";
    }

    public String x(){
        return z();
    }
}

public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        System.out.println(a.x());
    }
}
