package bitcamp.java106.step05;

public class Tire {
    String maker;
    int width;
    int ratio;
    int whell;
    
    
    @Override
    public String toString() {
        return "Tire [maker=" + maker + ", width=" + width + ", ratio=" + ratio + ", whell=" + whell + "]";
    }
    
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getRatio() {
        return ratio;
    }
    public void setRatio(int ratio) {
        this.ratio = ratio;
    }
    public int getWhell() {
        return whell;
    }
    public void setWhell(int whell) {
        this.whell = whell;
    }
    
    
}
