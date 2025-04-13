package SOLIDPrinciples.OpenClose;


public class Canvas {

    //SINGLETON Canvas
    private static Canvas instance;
    
    private Canvas(){}

    public static Canvas getInstance() {
        if (instance  == null)
            instance = new Canvas();
        return instance;
    }

    //generic shape functionality
    public void DrawShape(IShape shape){
        shape.draw();
    }

    public void ColorShape(IShape shape) {
        shape.color();
    }

    //instancialize
    public static void main(String[] args) {
        //init canvas
        Canvas canvas = Canvas.getInstance();
        
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();
        
        canvas.DrawShape(rect);
        canvas.DrawShape(circle);

        canvas.ColorShape(rect);
        canvas.ColorShape(circle);

    }
}
