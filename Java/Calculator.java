import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result =0;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Operantion: ");
        char ch =in.next().trim().charAt(0);
        while(true){
                
        
       
        if( ch == '+' || ch =='-' || ch == '*' || ch =='/' || ch =='%')
        {
           //input two numbers
           int a= in.nextInt();
           int b = in.nextInt();
           if(ch == '+'){
             result=a+b;
            
           }
           if(ch == '-'){
             result=a-b;
            

           }
           if(ch == '*'){
             result=a*b;
            
           }
           if(ch == '/'){
            if(b!=0){
             result=a/b;

            
            }
            else{
                System.out.println("Can't divide by zero.");
            }
           }
           if(ch == '%'){
             result=a%b;
            
           }
          
 
        }
        else if(ch =='x' || ch =='X'){
            break;
           }
        else
{
    System.out.println("Invalid Input!");
}

System.out.println("The result is: "+result);
    }
}
}