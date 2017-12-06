import java.util.ArrayList;

public class Player {

    private String name;
    private Hand hand;

    public Player(String inputName) {
        this.name = inputName;
        this.hand = new Hand();

    }


    public Card getCard() {
        return hand.getCard(0);
    }





}
