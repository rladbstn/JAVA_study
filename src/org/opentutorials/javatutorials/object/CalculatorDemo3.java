//73 객체화
package org.opentutorials.javatutorials.object;

class Calculator {

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
public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c1.setOprands(10, 20);
        c2.sum();
        c2.avg();
    }
}