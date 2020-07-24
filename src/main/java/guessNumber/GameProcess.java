package guessNumber;

public class GameProcess {
    private int gameCount;
    private GuessNumber guessNumber;

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public String play(int[] inputNumber) {
        if (this.getGameCount() > 6) {
            return "Game Over";
        }
        guessNumber.guessNumber(inputNumber);

        return null;
    }
}
