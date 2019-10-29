package OOP;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(int x, int y ){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y= y;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public double distance(int x2, int y2){
        return Math.sqrt(Math.pow(x2-x, 2) + Math.pow(y2-y,2));
    }
    public double distance(MyPoint another){
        return Math.sqrt(Math.pow(another.x-x, 2) + Math.pow(another.y-y,2));
    }
    public double distance(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
    }
}
