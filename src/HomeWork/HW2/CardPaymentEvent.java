package HomeWork.HW2;

/**
 * Created by mcachia on 12/01/2016.
 */
public abstract class CardPaymentEvent extends FinancialEvent {
    int cardNumber;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
