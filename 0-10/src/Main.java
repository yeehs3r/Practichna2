import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число");	
        int a = scanner.nextInt();
      
        if (a>=0 && a<=10)
        	System.out.println ("Позитивне число менше 10 або нуль");
        
        else {
        	System.out.println ("Позитивне число більше 10 або негативне");
            
        	
        }
        
	}
	
}