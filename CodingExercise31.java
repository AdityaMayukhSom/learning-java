public class CodingExercise31 {
    public class Wall {
        private double width;
        private double height;

        public Wall() {
            this(0, 0);
        }

        public Wall(double width, double height) {
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }

            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
        }

        public double getWidth() {
            return this.width;
        }

        public double getHeight() {
            return this.height;
        }

        public void setHeight(double height) {
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public void setWidth(double width) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
        }

        public double getArea() {
            double area = this.height * this.width;
            return area;
        }
    }
}
