public class Card {
    private String colour;
    private int number;

    public Card(String colour, int number) {
        this.colour = colour;
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return colour + " " + number;
    }
}
