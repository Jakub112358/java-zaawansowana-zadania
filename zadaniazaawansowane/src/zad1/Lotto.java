package zad1;

import java.util.Arrays;

//Zadanie 1
// Napisz klasę realizującą system lotto.
// Klasa powinna zawierać pola takie jak:
// - ostatnie losowanie (tablica liczb)
// - liczba wygranych
// - metodę do wykonania losowania (generowanie losowych 6 liczb z przedziału 1-49)
// - metoda powinna przyjmować na wejściu zestaw 6 liczb (u mnie: dowolną ilość liczb) i sprawdzać liczbę trafień, jeśli ktoś trafił 6 zwiększamy licznik wygranych
// Zadbaj o odpowiedni dostęp do informacji o ostatnim losowaniu.
public class Lotto {
    private Integer[] drawResults;
    private int numberOfWinners;

    public Integer[] getDrawResults() {
        return drawResults;
    }

    public int getNumberOfWinners() {
        return numberOfWinners;
    }

    public void performDraw() {
        drawResults = new Integer[6];
        int singleResult;
        for (int i = 0; i < drawResults.length; i++) {
            while (true) {
                singleResult = (int) Math.round(48 * Math.random() + 1);
                if (!Arrays.asList(drawResults).contains(singleResult)) {
                    drawResults[i] = singleResult;
                    break;
                }
            }
        }
    }

    public int checkMatches(Integer[] guesses) {
        int matches = 0;
        for (int guess : guesses) {
            for (int drawResult : drawResults) {
                if (drawResult == guess) {
                    matches++;
                }
            }
        }
        if(matches==drawResults.length){
            numberOfWinners++;
        }
        return matches;
    }
}
