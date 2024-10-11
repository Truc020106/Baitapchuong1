public class Rectangle {
    private int x;
    private int y;
    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public float getChuvi() {
        return (float) ((x+y)*2);
    }
    public float getDientich() {
        return (float) (x*y);
    }
}
