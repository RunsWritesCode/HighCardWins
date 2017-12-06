import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;


    public Hand() {
        this.cards = new ArrayList<>();
    }


    public int cardCount() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public Card getCard(int index) {
        return this.cards.remove(index);
    }
}
