package lotto.view;

import lotto.domain.Money;

public enum ErrorMessage {
    INVALID_MONEY_INPUT("[ERROR] 0원 이상인 " + Money.UNIT + "원 단위의 금액을 입력해주세요."),
    INVALID_LOTTO_NUMS_COUNT("[ERROR] %d개의 숫자를 입력해주세요.");

    public final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getInvalidPurchaseAmountMessage() {
        return INVALID_MONEY_INPUT.getMessage();
    }

    public String getInvalidLottoNumsCountMessage(Integer lottoNumsCount) {
        return String.format(INVALID_LOTTO_NUMS_COUNT.getMessage(), lottoNumsCount);
    }
}
