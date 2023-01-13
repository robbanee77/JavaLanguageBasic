import java.util.Scanner;
public class Workshop3 {
    public static void main(String[] args) {

    int hour;
    int wage1;
    int wage2;
    int all;
    

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your hour  ");
    hour=keyboard.nextInt();
   

    wage1=hour*30;

    if(hour<=8){
    System.out.println("Your wage is"+wage1);
    }

    else if (hour>8){
    wage2=(hour-8)*15;

    all=wage1+wage2;
    System.out.println("You got wage is"+all+"   baht.");

    }
        
    }
    
}
