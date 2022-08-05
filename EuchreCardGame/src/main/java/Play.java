public class Play {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (Card card:deck.euchreDeck)
        System.out.println(card.toString());
    }
}
