

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;
    SuitType[] suits = SuitType.values();
    ValueType[] values = ValueType.values();

    public Deck() {
        this.cards = new ArrayList<>();

        for (SuitType suit : suits) {
            for (ValueType value : values) {
                Card card = new Card(suit, value);
                this.cards.add(card);
            }
        }

    }




}
