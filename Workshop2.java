import java.util.Scanner;
public class Workshop2 {
    public static void main(String[] args) {
        int b,c,age;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your this year  ");
        b=keyboard.nextInt();
        System.out.println("Enter yor birth year  ");
        c=keyboard.nextInt();
        
        age=b-c;
       
    
        if(age>20)
        {
            System.out.println("your age is:"+ age);
            System.out.println("your are adult");
        }
        
        else if(age<=20)
        {
            System.out.println("your age is:"+ age );
            System.out.println("youtr are young");
        }
    
    
    }
    
}
