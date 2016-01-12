package HomeWork.PegasusHW1;

/**
 * Created by mcachia on 07/01/2016.
 */
public class Card extends Payees {

    int cardNumber;

    private void Card(int cardNumber) {
        this.cardNumber = cardNumber;
    }


    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
