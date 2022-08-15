public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String stringScore;
        if (player1Score == player2Score) {
            stringScore = showSameScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            stringScore = showScoreWin(player1Score, player2Score, player1Name, player2Name);
        } else {
            stringScore = showScoreAfterWin(player1Score, player2Score);
        }
        return stringScore;
    }

    public static String showSameScore(int player1Score) {
        return switch (player1Score) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            case 3 -> "Forty-All";
            default -> "Deuce";
        };
    }

    public static String showScoreWin(int player1Score, int player2Score, String player1Name, String player2Name) {
        String stringScore;
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) stringScore = "Advantage " + player1Name;
        else if (minusResult == -1) stringScore = "Advantage " + player2Name;
        else if (minusResult >= 2) stringScore = "Win for " + player1Name;
        else stringScore = "Win for " + player2Name;
        return stringScore;
    }

    public static String showScoreAfterWin(int player1Score, int player2Score) {
        return showScore(player1Score) + " - " + showScore(player2Score);
    }

    public static String showScore(int tempScore) {
        return switch (tempScore) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "No";
        };
    }
}