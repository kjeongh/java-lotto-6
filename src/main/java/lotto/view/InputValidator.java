package lotto.view;

import lotto.LottoConfig;
import lotto.error.InvalidMoneyInputException;

public class InputValidator {
    public void validateMoneyInput(String input) {
        try {
            validatePositiveInteger(input);
            Integer moneyAmount = Integer.parseInt(input);
            validateMoneyUnit(moneyAmount);
        } catch (Exception e) {
            throw new InvalidMoneyInputException();
        }
    }

    public void validateInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    private void validatePositiveInteger(String input) {
        validateInteger(input);
        if (Integer.parseInt(input) <= 0) {
            throw new IllegalArgumentException();
        }
    }

    private void validateMoneyUnit(Integer amount) {
        if (amount % LottoConfig.MONEY_UNIT != 0) {
            throw new IllegalArgumentException();
        }
    }
}
