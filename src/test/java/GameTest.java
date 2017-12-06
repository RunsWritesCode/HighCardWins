import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, ValueType.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetValue() {
        assertEquals(ValueType.ACE, card.getValue());
    }



}
