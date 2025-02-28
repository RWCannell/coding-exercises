public class Lunchbox {
    private String colour;
    private Integer length;
    private Integer height;
    private Integer width;

    public Lunchbox(String colour, Integer length, Integer height, Integer width) {
        this.colour = colour;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    // getters
    public String getColour() {
        return colour;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }

    // setters
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public static void main(String[] args) throws Exception {
        Lunchbox myLunchbox = new Lunchbox("Blue", 32, 16, 24);
        String message = "My lunchbox is " + myLunchbox.colour + " and has dimensions of " + myLunchbox.length + "cm by " + myLunchbox.width + "cm by " + myLunchbox.height + "cm.";
        System.out.println(message);
    }
}