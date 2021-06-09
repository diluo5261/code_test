import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardDemo {

    private static final String [] colours = {"红桃","黑桃","梅花","方片"};

    private List<Card> buyDeck(){

        List<Card> deck = new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <13 ; j++) {
                deck.add(new Card(colours[i],j+1));
            }
        }
        return deck;
    }

    private  void shuffle(List<Card> deck){
        Random random = new Random();
        for (int i = 0; i <52 ; i++) {
            int index = random.nextInt(51)+1;
            Card tmp = deck.get(i);
            deck.set(i,deck.get(index));
            deck.set(index,tmp);
        }
    }

    public static void main(String[] args) {
        CardDemo cardDemo = new CardDemo();
        List<Card> deck = cardDemo.buyDeck();

        System.out.println("新牌:");
        System.out.println(deck);

        System.out.println("洗牌");
        cardDemo.shuffle(deck);
        System.out.println(deck);

        List<List<Card>> hand = new ArrayList<>();
        hand.add(new ArrayList<>());
        hand.add(new ArrayList<>());
        hand.add(new ArrayList<>());
        System.out.println("发牌");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <3 ; j++) {
                hand.get(j).add(deck.remove(0));
            }
        }

        System.out.println("手牌1:");
        System.out.println(hand.get(0));
        System.out.println("手牌2:");
        System.out.println(hand.get(1));
        System.out.println("手牌3:");
        System.out.println(hand.get(2));
        System.out.println("剩下的牌:");
        System.out.println(deck);
    }
}
