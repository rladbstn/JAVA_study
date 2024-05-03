
class Calculator2{
    static double PI = 3.14;
    static int base = 0;
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum(int left, int right){
        System.out.println(left + right + base);
    }
    public void avg(){
        System.out.println((left + right) / 2);
    }
}
public class CalculatorDemo2 {
    public static void main(String[] args) {

        Calculator2.base = 10;

        Calculator2 c1 = new Calculator2();
        c1.sum(10,20);

        Calculator2 c2 = new Calculator2();
        c2.sum(20,40);


    }
}


