package EloAlgorithm;

public class Main {

    private final static int k = 30;

    public static void main(String[] args) {

        Games cricket  = new Games(1, "Cricket");

        People player1 = new People(1, "Elizabeth", "II", 3.55, true,  cricket);
        People player2 = new People(2, "Prince", "Charles", 5.55, false, cricket);

        Elo.EloRating(player1, player2, k);

        player1.setWinner(false);
        player2.setWinner(true);

        Elo.EloRating(player1, player2, k);
    }
}
