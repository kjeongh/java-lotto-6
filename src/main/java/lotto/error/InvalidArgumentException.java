package lotto.error;

import lotto.view.ErrorMessage;

public class InvalidArgumentException extends IllegalArgumentException {
    public InvalidArgumentException(ErrorMessage message) {
        super(message.getMessage());
    }
}