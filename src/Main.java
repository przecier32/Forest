import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Forest> forestList = new ArrayList<Forest>();

        for (int i = 0; i < 4; i++) {

            System.out.print("Podaj nazwe drzewa: ");

            Scanner scan = new Scanner(System.in);
            String a = scan.nextLine();

            Forest las = new Forest(i,a);
            forestList.add(las);

        }

        for (Forest x : forestList) {

            x.printForest();

        }




    }
}
