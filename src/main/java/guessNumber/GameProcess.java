package guessNumber;


public class GameProcess {
    private int gameCount;
    private static final String WRONG_INPUT_MEG = "Wrong Input,Input again";
    private static final String GAME_OVER = "Game Over";
    private static final String GAME_WIN = "win, all correct";
    private static final String GAME_CORRECT_RESULT = "4A0B";
    private static final int GAME_TOTAL_TIMES = 6;
    private GuessNumber guessNumber;
    private InputValidator inputValidator;

    public GameProcess(GenerateAnswer generateAnswer) {
        inputValidator = new InputValidator();
        int[] answer = generateAnswer.generate();
        this.guessNumber = new GuessNumber(answer);
        this.gameCount = 0;
    }

    private int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public String play(int[] inputNumber) {
        this.gameCount++;
        if (this.getGameCount() > GAME_TOTAL_TIMES) {
            return GAME_OVER;
        }
        if (!inputValidator.isValidInputNumber(inputNumber)){
            return WRONG_INPUT_MEG;
        }
        String gameResult = guessNumber.getGameResult(inputNumber);
        return outPutGameResult(gameResult);
    }

    private String outPutGameResult(String gameResult) {
        if ((GAME_CORRECT_RESULT).equals(gameResult)) {
            return GAME_WIN;
        }
        return gameResult;
    }


}
