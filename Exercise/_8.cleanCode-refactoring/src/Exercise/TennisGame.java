package Exercise;

public class TennisGame {
     static String matchProgress = "";
    static int tempScore = 0;
    static int matchPoint=4;

    public static void main(String[] args) {
        System.out.println(getScore("khoa","thi",3,2));

    }
    private static final String zeroPoint = "Love", firstPoint = "Fifteen",
            secondPoint = "Thirty", thirdPoint = "Forty", deuce = "Deuce" ,all="All";


    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {

        if (player1Score == player2Score) {
            getGameStatus(player1Score, matchProgress);
        } else if (player1Score >= matchPoint || player2Score >= matchPoint) {
            getGameResult(player1Score, player2Score, matchProgress);
        } else {
            getGameStatus(player1Score, player2Score, matchProgress, tempScore);

        }
        return matchProgress;
    }

    private static void getGameResult(int scoreOfPlayer1, int scoreOfPlayer2, String gameStatus) {
        int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
        if (minusResult == 1) gameStatus += "Advantage player1";
        else if (minusResult == -1) gameStatus += "Advantage player2";
        else if (minusResult >= 2) gameStatus += "Win for player1";
        else gameStatus += "Win for player2";
    }

    private static void getGameStatus(int scoreOfPlayer1, int scoreOfPlayer2, String gameStatus, int tempScore) {
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOfPlayer1;
            else {
                gameStatus += "-";
                tempScore = scoreOfPlayer2;
            }
            switch (tempScore) {
                case 0:
                    gameStatus += zeroPoint;
                    break;
                case 1:
                    gameStatus += firstPoint;
                    break;
                case 2:
                    gameStatus += secondPoint;
                    break;
                case 3:
                    gameStatus += thirdPoint;
                    break;
            }
        }
    }

    private static void getGameStatus(int scoreOfPlayer, String gameStatus) {
        switch (scoreOfPlayer) {
            case 0:
                gameStatus = zeroPoint + all;
                break;
            case 1:
                gameStatus = firstPoint+all;
                break;
            case 2:
                gameStatus = secondPoint+all;
                break;
            case 3:
                gameStatus = thirdPoint+all;
                break;
            default:
                gameStatus = deuce;
                break;

        }
    }
}