public class Point {
    private int x;
    private int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int[] getXY() {
        int[] arr = {x, y};
        return arr;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        double dist = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        return dist;
    }

    public double distance(Point another) {
        double dist = Math.sqrt(Math.pow((another.x - x), 2) + Math.pow((another.y - y), 2));
        return dist;
    }

    public double distance() {
        double dist = Math.sqrt(Math.pow((- x), 2) + Math.pow((- y), 2));
        return dist;
    }
}
