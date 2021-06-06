package arraylist;

/*

 */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Card{
    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return suit + rank  ;
    }
}

class CardDemo{
    private static final String[] suits ={"红桃","黑桃","方片","梅花"};

    public List<Card> buyDesk(){
        List<Card> desk = new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            for (int j = 1; j <=13 ; j++) {
                int rank = j;
                String suit = suits[i];
                Card card = new Card(rank,suit);
                desk.add(card);
            }
        }
        return desk;
    }

    private void swap(List<Card> desk, int i ,int index){
        Card tmp = desk.get(i);
        desk.set(i,desk.get(index));
        desk.set(index,tmp);

    }

    public void shuffle(List<Card> desk){
        int len = desk.size();
        for (int i = len -1; i > 0 ; i--) {
            Random random = new Random();
            int index = random.nextInt(i);
            swap(desk,i,index);
        }
    }
}

public class Project04 {
    public static void main(String[] args) {
        CardDemo cardDemo = new CardDemo();
        List<Card> desk = cardDemo.buyDesk();
        System.out.println(desk);

        System.out.println("*****************洗牌**************");
        cardDemo.shuffle(desk);
        System.out.println(desk);

        System.out.println("*****************发牌**************");

        //共三个人,每个人发5张
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();
        List<List<Card>> hands= new ArrayList<>();

        hands.add(hand1);
        hands.add(hand2);
        hands.add(hand3);

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <3 ; j++) {
                Card card = desk.remove(0);
                hands.get(j).add(card);
            }
        }

        for (int i = 0; i <hands.size() ; i++) {
            System.out.println(hands.get(i));

        }
    }
}
