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
        guessNumber.guessNumber(inputNumber);

        return null;
    }
}
