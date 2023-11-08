package lotto.domain;

import lotto.error.InvalidArgumentException;
import lotto.view.ErrorMessage;

public class Money {
    public static final Integer UNIT = 1000;

    private final Integer amount;

    public Money(Integer amount) {
        validate(amount);
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer divide(Money dividendMoney) {
        if(amount > dividendMoney.amount) {
            throw new IllegalArgumentException();
        }
        return dividendMoney.amount / this.amount;
    }

    private void validate(Integer amount) {
        validatePositive(amount);
        validateUnit(amount);
    }

    private void validatePositive(Integer amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
    }

    private void validateUnit(Integer amount) {
        if (amount % UNIT != 0) {
            throw new IllegalArgumentException();
        }
    }
}