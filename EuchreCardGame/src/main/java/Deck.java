import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> euchreDeck;

    public Deck() {
        List<Card> cards = new ArrayList<>();
        for (int i = 9; i <15; i++) {
            Card card1 = new Card(Card.SUIT.DIAMONDS,i );
            cards.add(card1);
            Card card2 = new Card(Card.SUIT.CLUBS,i );
            cards.add(card2);
            Card card3 = new Card(Card.SUIT.SPADES,i );
            cards.add(card3);
            Card card4 = new Card(Card.SUIT.HEARTS,i );
            cards.add(card4);
        }
        Collections.shuffle(cards);
        this.euchreDeck = cards;
    }

    public List<Card> getEuchreDeck() {
        return euchreDeck;
    }


}
