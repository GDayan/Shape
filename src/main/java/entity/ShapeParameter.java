package entity;

public class ShapeParameter {
    private double area;
    private double perimeter;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter)
    {
        this.perimeter = perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeParameter that = (ShapeParameter) o;
        return  Double.compare(that.area, area) == 0 && Double.compare(that.perimeter, perimeter) == 0;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = (int)(prime * result + Double.valueOf(area).hashCode());
        result = (int)(prime * result + Double.valueOf(perimeter).hashCode());
        return result;
    }

    @Override
    public String toString(){

        return "ShapeParametr{" + "area=" + area + ", " + perimeter + ", perimeter" +"}";
    }
}
