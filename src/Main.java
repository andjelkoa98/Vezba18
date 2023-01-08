import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String [] imena = new String[]{"Heart", "Cherry", "Coin", "Melon", "Jocker"};
        Random rand = new Random();
        int rendomBroj;

        for (int i = 0; i < imena.length; i++) {
            rendomBroj= rand.nextInt(imena.length);
            System.out.print(imena[rendomBroj] + " ");
        }
    }
}