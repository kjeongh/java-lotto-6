package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.Money;

public class InputView {

    public Money readPurchaceAmount() {
        final String input = Console.readLine();
        return new Money(Integer.parseInt(input));
    }
}
