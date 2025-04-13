package SOLIDPrinciples.OpenClose;

public class Circle implements IShape {
    Circle(){}

    @Override
    public void draw(){
        System.out.println("Drawing circle");
    }

    @Override
    public void color() {
        String[] strArray = {"red", "green", "blue"};

        //string array of 3 colors
        int randomIndex = (int) (Math.random() * strArray.length);
        String color = strArray[randomIndex];

        System.out.println("Coloring circle with color " + color);
    }
    
}
