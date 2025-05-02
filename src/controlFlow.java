import java.util.Scanner;



public class controlFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uni = 200;
        int poly = 150;
        int coe = 100;
        System.out.println("What is your score?");
        int score = sc.nextInt();

        if (score>=uni){
            System.out.println("You can enter a university");

        } else if (score<uni && score>=poly) {
            System.out.println("Enter a polytechnic");

        } else if (score<poly && score>=coe) {
            System.out.println("Enter a college of education");

        }else {
            System.out.println("Baba go home... Till next year");
        }

        int x = 10;
        for (int i = 0; i <= x; i++) {
            System.out.println(i);

        }
    }
}
