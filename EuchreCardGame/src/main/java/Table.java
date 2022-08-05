import java.util.List;

public class Table {
    List<Card> kitty;
    List<Card> playerHand;
    List<Card> AI1hand;
    List<Card> AI2hand;
    List<Card> AI3hand;
    List<Card> AI4hand;
    Deck deck;
    String teamOne;
    String teamTwo;


    Table() {
        this.deck = new Deck()
    }


}
