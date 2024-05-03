//92 오버로딩
package org.opentutorials.javatutorials.overloading.example1;

public class Overloadingdemo2 extends OverloadingDemo {
    void A(String arg1, String arg2) {
        System.out.println(arg1);
    }
    void A(){
        System.out.println("sub class : void A()");
    }

    public static void main(String[] args) {
        Overloadingdemo2 od = new Overloadingdemo2();

        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");

    }
}
