//80 전역변수, 지역변수
public class ScopeDemo2 {
    static int i;
    static void a(){
        i = 0;
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++){
            a();
            System.out.println(i);
        }
    }
}
