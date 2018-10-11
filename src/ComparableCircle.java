public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    public static void sort(ComparableCircle[] c){
        for (int i = 0 ; i < c.length;i++){
            for (int j = i+1;j<c.length;j++){
                if (c[i].compareTo(c[j])==1){
                    ComparableCircle temp = new ComparableCircle();
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

}