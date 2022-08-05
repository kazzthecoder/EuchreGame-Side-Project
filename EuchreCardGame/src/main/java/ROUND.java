import java.util.List;

public class ROUND {
    Deck deck;
    List<Card> kitty;
    Card.SUIT trump;
    Boolean isLoner;
    Card turnUp;
    Player dealer = new Player();
    Player rightDealer;
    Player acrossDealer;
    Player leftDealer;
    int teamOneScore;
    int teamTwoScore;

    ROUND() {
        this.deck = new Deck();
        this.turnUp = dealRound(this.deck);
        this.isLoner = false;
    }

    public Card dealRound(Deck deck) {
        for (int i = 0; i < 20; i += 4) {
            Card card = deck.euchreDeck.get(i);
            rightDealer.hand.add(card);
            card = deck.euchreDeck.get(i + 1);
            acrossDealer.hand.add(card);
            card = deck.euchreDeck.get(i + 2);
            leftDealer.hand.add(card);
            card = deck.euchreDeck.get(i + 3);
            dealer.hand.add(card);
        }
        this.kitty.add(deck.euchreDeck.get(20));
        this.kitty.add(deck.euchreDeck.get(21));
        this.kitty.add(deck.euchreDeck.get(22));
        return deck.euchreDeck.get(23);
    }
    public void callUpKitty(Card turnUp) {
        this.trump = turnUp.getSuit();
        dealer.pickUp(turnUp);
        dealer.discard();

        {

        }
    }
}

