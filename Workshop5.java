import java.util.Scanner;
public class Workshop5 {
    public static void main(String[] args) {

        int medicine;
        int years;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your age  ");
    years=keyboard.nextInt();

    
    if(years<=5){
    medicine=4*3/2;
    System.out.println("You got drug "+medicine+" tabs.");
    }
    
    else if(years>=6&&years<=15){
    medicine=4*3*1;
    System.out.println("You got drug "+ medicine+" tabs.");
    }
    else if(years>=16){
    medicine=4*3*2;
    System.out.println("You got drug "+ medicine+" tabs.");
    }
    
    }
    
}
