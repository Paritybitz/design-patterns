package SOLIDPrinciples.OpenClose;

public class Rectangle implements IShape {
    Rectangle(){}

    @Override
    public void draw(){
        System.out.println("Drawing rectangle");
    }

    @Override
    public void color() {
        String[] strArray = {"red", "green", "blue"};

        //string array of 3 colors
        int randomIndex = (int) (Math.random() * strArray.length);
        String color = strArray[randomIndex];

        System.out.println("Coloring rectangle with color " + color);
    }
}
