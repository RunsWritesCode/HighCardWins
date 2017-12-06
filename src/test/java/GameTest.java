import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Card card;
    Deck deck;
    Player player;
    Hand hand;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, ValueType.ACE);
        deck = new Deck();
        player = new Player("Bob Dylan");
        hand = new Hand();
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetValue() {
        assertEquals(ValueType.ACE, card.getValue());
    }

    @Test
    public void deckHas52() {
        assertEquals(52, deck.count());
    }


    @Test
    public void canRemoveCardFromDeck() {
        deck.deal();
        assertEquals(51, deck.count());
    }

    @Test
    public void deckCanDeal() {
        hand.addCard(deck.deal());
        assertEquals(51, deck.count());
        assertEquals(1, hand.cardCount());
    }



    @Test
    public void addCard() {
        hand.addCard(card);
        assertEquals(1, hand.cardCount());
    }


}
