import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String [] imena = new String[]{"Heart", "Cherry", "Coin", "Melon", "Jocker"};
        Random rand = new Random();
        int rendomBroj;
        String [] noviNiz = new String[imena.length];

        for (int i = 0; i < imena.length; i++) {
            rendomBroj= rand.nextInt(imena.length);
            noviNiz[i] = imena[rendomBroj];
        }
        for (String i : noviNiz) {
            System.out.print(i + " ");
        }
    }
}