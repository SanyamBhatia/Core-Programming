import java.util.Scanner;

public class Level2Q9 {

    public static String getComputerChoice() {
        int num = (int)(Math.random() * 3);
        return new String[]{"rock", "paper", "scissors"}[num];
    }

    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return "User";
        return "Computer";
    }

    public static void displayStats(int userWins, int compWins, int draws, int games) {
        System.out.println("Games\tUser Wins\tComp Wins\tDraws");
        System.out.println(games + "\t" + userWins + "\t\t" + compWins + "\t\t" + draws);
        System.out.printf("User Win %%: %.2f%%\n", (userWins * 100.0 / games));
        System.out.printf("Computer Win %%: %.2f%%\n", (compWins * 100.0 / games));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Round " + i + " - Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);
            System.out.println("Computer chose: " + comp + " => Result: " + winner);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;
        }

        displayStats(userWins, compWins, draws, n);
    }
}
