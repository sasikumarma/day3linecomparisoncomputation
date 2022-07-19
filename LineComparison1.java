public class LineComparison1 {
    public static void main(String[] args) {
       System.out.println("Welcome To Line Comparison Computation");
        int x1 = 3;
        int x2 = 5;
        int y1 = 4;
        int y2 = 2;
        int a1 = 4;
        int a2 = 8;
        int b1 = 6;
        int b2 = 3;
        double dis = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        double di = Math.sqrt(Math.pow((a2-a1), 2) + Math.pow((b2-b1), 2));
        System.out.println("Two points are (x1,y1)(3,4) and (x2,y2)(5,2)");
        System.out.println("Another Two points are (a1,b1)(4,6) and (a2,b2)(8,3)");
        System.out.println("Length of the  line (3,4)(5,2) is " + dis);
     System.out.println("Length of the second line (4,6)(8,3) is " + di);

    }
}
