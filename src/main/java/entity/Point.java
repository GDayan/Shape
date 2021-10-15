package entity;

import generator.IdGenerator;

public class Point {
    private long pointid;
    private double x;
    private double y;

    public Point(){
    }

    public Point(double x, double y){
        IdGenerator generator = new IdGenerator();
        this.pointid = generator.generatorID();
        this.x = x;
        this.y = y;
    }

    public long getId(){

        return pointid;
    }

    public void setId(long pointid){

        this.pointid = pointid;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {

        return y;
    }

    public void setY(double y) {

        this.y = y;
    }

    @Override
    public String toString(){

        return "Point{" + "id=" + pointid + ", x=" + x + ", y=" + y + "}";
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = (int)(prime * result + Double.valueOf(pointid).hashCode());
        result = (int)(prime * result + Double.valueOf(x).hashCode());
        result = (int)(prime * result + Double.valueOf(y).hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return pointid == point.pointid && Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }
}
