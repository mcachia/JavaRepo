package HomeWork.PegasusHW1;

/**
 * Created by mcachia on 08/01/2016.
 */
public class MainMethod {

    public static void main(String[] args) {
        Card card = new Card();
        card.setCardNumber(400001137);
        card.setName("Mark");
        Bank bank = new Bank();
        bank.setBranchName("HSBC");
        bank.setName("Wallace");
    }
}
