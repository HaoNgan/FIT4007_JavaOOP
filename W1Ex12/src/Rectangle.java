public class Rectangle {
    //Properties
    private float width;
    private float height;

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getArea() {
        return this.width * height;
    }

    public float getCircumference() {
        return 2*(height + width);
    }

}
