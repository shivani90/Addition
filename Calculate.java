
import java.util.Scanner;

public class Calculate {
     public static void main(String[] args) {
        
  int a,b,add,mult,subt,opt;
  double div;
          Scanner s=new Scanner (System.in);
        
           System.out.println("Enter first number");
               a = s.nextInt();
        
           System.out.println("Enter second number");
               b = s.nextInt();
        
        while(true)
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 for Exit");
        opt =s.nextInt();
       
        switch(opt)
        {
            case 1:
                add =a+b;
                System.out.println("Result:"+add);
                break;
                
            case 2:
                subt =a-b;
                System.out.println("Result:"+subt);
                break;
             
                case 3:
                mult =a*b;
                System.out.println("Result:"+mult);
                break;
            
                case 4:
                div =a/b;
                System.out.println("Result:"+div);
                break;
            
                case 5:
                System.exit(0);
               }
            }
          }
        }


   
        
      
    
     











