package basics.controlflow;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter Breadth:");
        int b = sc.nextInt();
        int area = l*b;
        System.out.println(area);

        sc.close();
    }
    
}
