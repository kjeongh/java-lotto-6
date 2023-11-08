package lotto;

import lotto.controller.LottoGame;
import lotto.domain.LottoMachine;
import lotto.domain.Money;
import lotto.domain.NumberGenerator;
import lotto.domain.RandomNumberGenerator;

public class Application {
    public static void main(String[] args) {
        NumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        LottoMachine lottoMachine = new LottoMachine(randomNumberGenerator);
        LottoGame lottoGame = new LottoGame(lottoMachine);
        lottoGame.startGame();
    }
}
