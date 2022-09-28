import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число");	
        int a = scanner.nextInt();
        if (a%2 == 0 )
        	System.out.println(a);
        else {
        	System.out.println ("Число не парне");
        }
        
	}
	
}