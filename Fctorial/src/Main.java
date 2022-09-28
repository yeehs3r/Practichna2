
public class Main {
    public static void main(String args[]) {
        int a = 0;
        int b = 6;
        int num = a + (int) (Math.random() * b);
        
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println("Факториал " + num + " равен " +result);
    }
}