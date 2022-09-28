import java.util.Scanner;
public class Main2 {
	public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);	
        System.out.println("Введіть день тижня");
        int day = scanner.nextInt();
       
	switch (day) {
	  case 1:
	    System.out.println("Понеділок");
	    break;
	  case 2:
	    System.out.println("Вівторок");
	    break;
	  case 3:
	    System.out.println("Середа");
	    break;
	  case 4:
	    System.out.println("Четверг");
	    break;
	  case 5:
	    System.out.println("П'тниця");
	    break;
	  case 6:
	    System.out.println("Вихідний");
	    break;
	  case 7:
	    System.out.println("Вихідний");
	    break;
	    default: System.out.println ("Такого дня немає");
	}
	}
	}
