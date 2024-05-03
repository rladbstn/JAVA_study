//76 클래스변수
package org.opentutorials.javatutorials.classinstance;

class Calculator {
    static double PI = 3.14;
    int left, right;

    public void setOprands (int left, int right) {
        this.left = left;
        this.right = right;

    }

    public  void avg() {
        System.out.println((left + right) / 2);
    }

    public  void sum() {
        System.out.println(left + right);
    }
}
public class CalculatorDemo1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);

        Calculator c2 = new Calculator();
        System.out.println(c2.PI);

        System.out.println(Calculator.PI);

    }
}
