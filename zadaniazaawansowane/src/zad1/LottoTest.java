package zad1;

import java.util.Arrays;

public class LottoTest {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.performDraw();
        System.out.println("draw results: " + Arrays.toString(lotto.getDrawResults()));

        Integer[][] guesses = new Integer[14_000_000][];
        for (int i = 0; i < guesses.length; i++) {
            guesses[i] = makeRandomGuess(6);
            lotto.checkMatches(guesses[i]);
        }
        System.out.println("number of winners: " + lotto.getNumberOfWinners());

        Integer[] checkingGuess = makeRandomGuess(10);
        System.out.println(lotto.checkMatches(checkingGuess) + " matches for guess: " + Arrays.toString(checkingGuess));

    }

    public static Integer[] makeRandomGuess(int guessesNumber) {
        Integer[] randomGuess = new Integer[guessesNumber];
        int singleResult;
        for (int i = 0; i < randomGuess.length; i++) {
            while (true) {
                singleResult = (int) Math.round(48 * Math.random() + 1);
                if (!Arrays.asList(randomGuess).contains(singleResult)) {
                    randomGuess[i] = singleResult;
                    break;
                }
            }
        }
        return randomGuess;
    }
}
