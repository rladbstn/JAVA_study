package org.opentutorials.javatutorials.exception;

class Calculator {
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void divide(){
        try {
            System.out.println("계산 결과는");
            System.out.println(this.left / this.right);
            System.out.println("입니다");
        }catch (Exception e){
            System.out.println("\n\ne.getmessage()\n" + e.getMessage());
            System.out.println("\n\ne.toString()\n" + e.toString());
            System.out.println("\n\ne.printStackTrace()\n");
            e.printStackTrace();
        }
        System.out.println("Divide End");

    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10,0);
        c1.divide();
    }
}
