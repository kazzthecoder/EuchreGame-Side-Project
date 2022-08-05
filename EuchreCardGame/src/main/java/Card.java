public class Card {

    private int value;
    private SUIT suit;

    public enum SUIT
    {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }

    public Card (SUIT suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SUIT getSuit() {
        return suit;
    }

    public void setSuit(SUIT suit) {
        this.suit = suit;
    }



    @Override
    public String toString() {
        if(this.value == 11) {
            return "JACK" + " of " + this.suit;
        } else if(this.value == 12) {
            return "QUEEN" + " of " + this.suit;
        } else if(this.value == 13) {
            return "KING" + " of " + this.suit;
        } else if(this.value == 14) {
            return "ACE" + " of " + this.suit;
        } else {
            return this.value + " of " + this.suit;
        }

    }

}
