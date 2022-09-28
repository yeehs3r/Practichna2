import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть числом день тижня");	
        int a = scanner.nextInt();
        if (a==1) {
        	System.out.println ("Понеділок");
        
        } else if  (a==2){
        	System.out.println ("Вівторок");
        	    
        	
        }
        else if  (a==3){
        	System.out.println ("Середа");
        	    
        	
        
      }
        else if  (a==4){
        	System.out.println ("Четверг");
        	    
        	
       
       }
        else if  (a==5){
        	System.out.println ("П'ятниця");
        	    
        	
        }
        else if  (a==6){
        	System.out.println ("Вихідний");
        	    
        	
       
       }
        else if  (a==7){
        	System.out.println ("Вихідний");
        	    
        	
        }
        else { System.out.println ("Неправильне число");}
        
	}
	
	
	
	
}