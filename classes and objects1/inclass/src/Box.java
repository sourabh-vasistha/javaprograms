class Box {
static double width;
static double height;
static double depth;
}
public class BoxJavaProgram {
    public static void main(String[] args){
        Box mybox = new Box();
        double vol;
        mybox.width = 20;
        mybox.height = 30;
        mybox.depth = 10;
         static vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("volume is "+vol);
    }
}