import java.awt.*;
public class pointer {
    public static void main(String[] agrs)
    {
       Point p1 = new Point(1,2);
       System.out.println(p1);
       Point p2 = p1;
       System.out.println(p2);
       p1.x = 26;
       p2.y = 16;
       System.out.println(p1);
       System.out.println(p2);
    }
}
