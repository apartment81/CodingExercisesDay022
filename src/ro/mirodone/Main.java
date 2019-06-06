package ro.mirodone;

public class Main {

    public static void main(String[] args) {
        
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        while (count++ < 3) {
            int y = (1 + 2 * count) % 3;
            switch (y) {
                default:
                case 0:
                    x -= 1;
                    break;
                case 1:
                    x += 5;
            }
        }
        System.out.println(x);
    }
}


     /* String s1 = "java";
      String s2= "java";

      StringBuilder sb1 = new StringBuilder();
      sb1.append("ja").append("va");

        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));*/
