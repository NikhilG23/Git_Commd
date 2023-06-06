import java.util.*;

import java.util.Scanner;
class Program1
{
    public static void main(String[] args) {
      int a,b;
      Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value of A :- ");
     a=sc.nextInt();
    System.out.println("Enter the Value of B :- ");
     b=sc.nextInt();
     System.out.println("What do you want to do :-");
     System.out.println("1. Sawp ");
     System.out.println("2. Multiple");
     System.out.println("3. Add");
     System.out.println("4. Subtraction");
     System.out.println("5. Division");
     int Value=sc.nextInt();
     switch(Value)
     {
        case 1: System.out.println("You choose Swap");
                a=a+b;
                b=a-b;
                a=a-b;
                System.out.println("After swap values are :- A = " +a+ " B = " +b);
                break;
        
        case 2: System.out.println("You choose Multiple");
                System.out.println("After multiple values are :- " +a*b);
                break;
    
        case 3: System.out.println("You choose Add ");
                System.out.println("After Add :- " +(a+b));
                break;
        
        case 4: System.out.println("You choose Subtraction");
                System.out.println("After Subtraction :- " + (a-b));
                break;
        
        case 5: System.out.println("You choose Division");
                System.out.println("After Division :- " +(a%b));
                break;
        
        default: System.out.println("You choose Invalid case"); 
     }
    }
}