import java.util.Scanner;
public class Workshop4 {
    public static void main(String[] args) {
        
    int hour;
    int parking;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your hour  ");
    hour=keyboard.nextInt();

    if(hour<=2){
        parking=hour*40;
        System.out.println("You have to pay:"+parking+" baht.");
        }
        
        else if(hour>=3&& hour<6){
        parking=(hour-2)*30+80;
        System.out.println("You have to pay:"+ parking+" baht.");
        }
        
        else if(hour>=6){
        parking=(hour-5)*20+170;    
        System.out.println("You have to pay:"+parking+" baht.");
        }

    }
    
}
