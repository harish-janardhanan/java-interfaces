import org.junit.Assert;



public class InterviewAddons {

    public static void main(String[] args) {

        swapVariables(5,7);
        swapVariables(-1, -20 );
        swapVariables(1,1);
        isInside();
    }

    private static void swapVariables(int x , int y){
        int xOld = x;
        int yOld = y;

        x = x + y;
        y = x - y; // this is effectively (x + y) - y = x
        x = x - y ; // this is effectively (x + y) - x = y
        Assert.assertEquals(xOld,y);
        Assert.assertEquals(yOld,x);
    }

    private static void isInside(){
        Rectangle rectangle = new Rectangle(1,5,1,5);

        Assert.assertTrue(rectangle.contains(new DataPoint(2,4)));
        Assert.assertFalse(rectangle.contains(new DataPoint()));
        Assert.assertFalse(new Rectangle().contains(new DataPoint()));
    }


}
