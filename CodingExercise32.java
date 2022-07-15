public class CodingExercise32 {
    public static class Point {
        private int x;
        private int y;

        public Point() {
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public double distance() {
            double d = Math.sqrt((this.x * this.x) + this.y * this.y);
            return d;
        }

        public double distance(int x1, int y1) {
            double d = Math.sqrt(((this.x - x1) * (this.x - x1)) + ((this.y - y1) * (this.y - y1)));
            return d;
        }

        public double distance(Point p) {
            double d = Math.sqrt(((this.x - p.x) * (this.x - p.x)) + ((this.y - p.y) * (this.y - p.y)));
            return d;
        }
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
