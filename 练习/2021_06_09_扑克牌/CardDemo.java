import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardDemo {

    public static final String[] colours = {"红桃","黑桃","梅花","方片"};

    private static List<Card>  buyDeck(){
        List<Card> deck = new ArrayList<>();

        for (int i = 0; i <4 ; i++) {
            for (int j = 1; j <=13 ; j++) {
                Card card = new Card(colours[i],j);
                deck.add(card);
            }
        }
        return deck;
    }
    private static void shuffle(List<Card> deck){
        Random random = new Random();

        for (int i = 0; i <deck.size() ; i++) {
            int num = random.nextInt(deck.size()-1);

            Card tmp = deck.get(i);
            deck.set(i,deck.get(num));
            deck.set(num,tmp);


        }
    }

    public static void main(String[] args) {
        List<Card> deck = buyDeck();
        System.out.println("新牌:");
        System.out.println(deck);

        System.out.println("洗过的牌:");
        shuffle(deck);
        System.out.println(deck);

        System.out.println("发牌,三个人,每个人发5张:");
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();

        List<List<Card>> list = new ArrayList<>();
        list.add(hand1);
        list.add(hand2);
        list.add(hand3);
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <3 ; j++) {
                list.get(j).add(deck.remove(0));
            }

        }

        System.out.println("A中的手牌");
        System.out.println(list.get(0));
        System.out.println("B中的手牌:");
        System.out.println(list.get(2));
        System.out.println("C中的手牌:");
        System.out.println(list.get(2));
        System.out.println("剩余的手牌:");
        System.out.println(deck);
    }



}
