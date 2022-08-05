import java.util.List;

public class Player {
    List<Card> hand;
    int position;
    boolean isDealer;
    boolean inLead;

    Player() {

    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setInLead(boolean inLead) {
        this.inLead = inLead;
    }
    public void pickUp(Card card) {
        this.hand.add(card);
    }
    public void discard(Card card) {
        this.hand.remove(card);
    }

}
