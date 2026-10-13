public class Rect {
    private int left;
    private int top;
    private int width;
    private int height;

    public Rect(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public int area(){
        return this.width * this.height;
    }

    public int getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

    public void doubleRect() {
        // this.width = this.width * 2;
        // this.height = this.height * 2;
        this.width *= 2;
        this.height *= 2;
    }

    public void growRect(int growthFactor) {
        this.width *= growthFactor;
        this.height *= growthFactor;
    }

    // setter / mutator
    public void setWidth(int newWidth) {
        this.width = newWidth;
    }
    public int getWidth() {
        return this.width;
    }
}
