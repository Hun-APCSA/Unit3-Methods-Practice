public class RectRunner {
    public static void main(String[] args) {
        Rect r = new Rect(1, 1, 100, 200);
        int area = r.area();
        Peek.at(area);
        r.growRect(3);
        // r.width = -5;
        r.setWidth(-5);

        Peek.at(r.getWidth());
        String name = new String("Pac");
        String firstLetter = name.substring(0, 1);
        Peek.at(firstLetter);
        String lastLetter = name.substring(2);
        Peek.at(name.compareTo("Paa"));
        
    }
}
