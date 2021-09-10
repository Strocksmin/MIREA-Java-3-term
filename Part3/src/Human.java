public class Human {
    public static void main(String[] args) {
        Leg leg = new Leg(100, 43);
        Head head = new Head();
        Hand hand = new Hand();
        leg.oneStep();
        head.closeEyes();
        hand.moveHand();
    }
}
class Head {
    private boolean isEyes = true;

    void closeEyes() {
        isEyes = false;
    }
}
class Leg {
    private int size;

    public Leg(int length, int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void oneStep() {
        System.out.println("Сделан Шаг");
    }

}
class Hand {
    public void moveHand() {
        System.out.println("Рука произвела движение");
    }
}