import poker.PokerDeck;
import java.util.ArrayList;
import poker.Card;

public class Asg2
{
        public static void main(String[] args)
        {
                PokerDeck pk;
                pk = new PokerDeck();
                ArrayList<Card> deck;
                deck = pk.toArrayList();
                System.out.println(deck.toString());
                pk.shuffle();
                deck = pk.toArrayList();
                System.out.println(deck.toString());

        }

}