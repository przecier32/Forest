public class Forest {

    public Integer howMuch;
    public String whatTree;

    public Forest(int howMuch, String whatTree) {
        this.howMuch = howMuch;
        this.whatTree = whatTree;
    }

    void printForest() {

        System.out.println("W tym lesie jest " + howMuch + " drzew. I rosnie tam " + whatTree + ".");
    }


}
