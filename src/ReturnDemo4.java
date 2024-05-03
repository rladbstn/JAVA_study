public class ReturnDemo4 {
    public static String [] getMembers(){
    String []  members = {"최진혁", "김윤수"};
        return members;
        }


public static void main(String[] args) {
    String [] members = getMembers();
    System.out.println(members[0]);
  }
}