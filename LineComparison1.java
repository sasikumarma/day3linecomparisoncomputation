public class LineComparison1 {
    public static void main(String[] args) {
       System.out.println("Welcome To Line Comparison Computation");
        int x1 = 3;
        int x2 = 5;
        int y1 = 4;
        int y2 = 2;
        double dis = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.println("Two points are (x1,y1)(3,4) and (x2,y2)(5,2)");
        System.out.println("Length of the  line (3,4)(5,2) is " + dis);

    }
}
