import java.util.Scanner;
public class Workshop1 {
    public static void main(String[] args) {
        int score;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your score");
        score=keyboard.nextInt();

        if(score>=50){
            System.out.println("You passed examination");
        }
        else{
            System.out.println("You fail examination");
        }
    }
    
}
