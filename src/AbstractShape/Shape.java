package AbstractShape;


public abstract class Shape {
    protected String _color = "red";
    protected Boolean _filled = true;

    public Shape(){}

    public Shape(String color, Boolean filled) {
        _color = color;
        _filled = filled;
    }
    public String getColor(){
        return _color;
    }
    public void setColor(String color){
        _color = color;
    }
    public Boolean isFilled() {return _filled;}
    public void setFilled(Boolean filled) {
        _filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A Shape with color of ")
                .append(_color)
                .append(" and ");
        if (_filled) {
            sb.append("filled");
        } else {
            sb.append("not filled");
        }
        return sb.toString();
    }
}
