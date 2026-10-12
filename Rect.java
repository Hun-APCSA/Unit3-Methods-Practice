public class Rect {
    int left;
    int top;
    int width;
    int height;

    public Rect(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public int area(){
        return this.width * this.height;
    }
}
