
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();

        for (SuitType suit : SuitType.values()) {
            for (ValueType value : ValueType.values()) {
                Card card = new Card(suit, value);
                this.cards.add(card);
            }
        }

    }


    public int count() {
        return this.cards.size();
    }

    public Card shuffle(){
        Collections.shuffle(this.cards);
        return cards.get(0);
    }

    public Card deal() {
        return this.cards.remove(0);
    }




}
