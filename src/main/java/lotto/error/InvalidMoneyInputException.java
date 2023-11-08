package lotto.error;

import lotto.view.ErrorMessage;

public class InvalidMoneyInputException extends IllegalArgumentException {
    public InvalidMoneyInputException() {
        super(ErrorMessage.INVALID_MONEY_INPUT.getMessage());
    }
}
