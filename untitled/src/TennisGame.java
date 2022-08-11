public class TennisGame {
    String score = "";
    int tempScore;
    public String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
           score = checkScore(player1Score,score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            score = checkMinusRusult(minusResult, score, player1Name, player2Name);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    score += "-";
                    tempScore = player2Score;
                }
                score = checkScore(tempScore,score);
            }
        }
        return score;
    }
    public String checkScore(int Score, String score){
        switch (Score){
            case 0:
                score += "Love-All";
                break;
            case 1:
                score += "Fifteen-All";
                break;
            case 2:
                score += "Thirty-All";
                break;
            case 3:
                score += "Forty-All";
                break;
            default:
                score += "Deuce";
                break;
        }
        return score;
    }
    public String checkMinusRusult(int minusResult, String score1, String player1Name, String player2Name){
        if (minusResult == 1)
            score1 = "Advantage " +player1Name ;
        else if (minusResult == -1)
            score1 = "Advantage " + player2Name;
        else if (minusResult >= 2)
            score1 = "Win for " + player1Name;
        else
            score1 = "Win for " +player2Name;
        return score1;
    }
}
