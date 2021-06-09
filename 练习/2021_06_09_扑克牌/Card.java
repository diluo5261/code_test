public class Card {
    private String colour;
    private int num;

    public Card(String colour, int num) {
        this.colour = colour;
        this.num = num;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return colour + " " + num ;
    }
}
