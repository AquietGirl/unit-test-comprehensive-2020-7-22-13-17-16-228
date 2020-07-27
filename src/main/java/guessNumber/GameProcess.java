package guessNumber;


public class GameProcess {
    private int gameCount;
    private static final String WRONG_INPUT_MEG = "Wrong Input,Input again";
    private static final String GAME_OVER = "Game Over";
    private static final String GAME_WIN = "win, all correct";
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
        if (this.getGameCount() > 6) {
            return GAME_OVER;
        }
        if (!inputValidator.isValidInputNumber(inputNumber)){
            this.gameCount++;
            return WRONG_INPUT_MEG;
        }
        this.gameCount++;
        String gameResult = guessNumber.getGameResult(inputNumber);
        return outPutGameResult(gameResult);
    }

    private String outPutGameResult(String gameResult) {
        if (gameResult !=null && gameResult.equals("4A0B")) {
            return GAME_WIN;
        }
        return gameResult;
    }


}
