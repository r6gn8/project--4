import java.awt.*;
import java.util.Scanner;

public class Rx1 {
    public static void main(String[] args) {
        int width;
        int height;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the width");
        width=input.nextInt();
        System.out.println("enter the height");
        height=input.nextInt();
        Rectangle a=new Rectangle(width,height);
        System.out.println("actual perimter="+2*(a.getWidth()+a.getHeight()));
        System.out.println("expected perimter ="+2*(height+width));
    }
}
