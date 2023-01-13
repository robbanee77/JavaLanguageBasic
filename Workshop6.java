import java.util.Scanner;
public class Workshop6 {
    public static void main(String[] args) {

    int number1;
    int number2;
    int answer;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your number1  ");
    number1=keyboard.nextInt();
    System.out.println("Enter your number2  ");
    number2=keyboard.nextInt();
    answer=number1-number2;

    if (answer>0){
        System.out.println("answer="+answer);
        System.out.println("POSITIVE NUMBER");
     }
     
     else if (answer<0){
        System.out.println("answer="+answer);
        System.out.println("NEGATIVE NUMBER");
     }    
    else if (answer==0){
        System.out.println("answer="+answer);
        System.out.println("ZERO NUMBER");
    } 
       
    }
    
}
