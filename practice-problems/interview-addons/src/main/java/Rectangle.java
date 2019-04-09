public class Rectangle {
    float x1, y1, x2, y2;

    Rectangle(){
        this.x1 = Float.POSITIVE_INFINITY;
        this.x2 = Float.POSITIVE_INFINITY;
        this.y1 = Float.NEGATIVE_INFINITY;
        this.y2 = Float.NEGATIVE_INFINITY;
    }

    Rectangle(float x1, float x2, float y1, float y2 ){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public boolean contains(DataPoint dataPoint){
        return dataPoint.x >= this.x1 && dataPoint.x <= this.x2 && dataPoint.y >= this.y1 && dataPoint.y <= this.y1;
    }
}
