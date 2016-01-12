package HomeWork.PegasusHW1;

/**
 * Created by mcachia on 07/01/2016.
 * we have the following scenario
 * [07/01/2016 14:44:38] NX-Wallace Wadge: We have to keep track of payees in pegasus
 * [07/01/2016 14:44:43] NX-Wallace Wadge: some payees are bank payees
 * [07/01/2016 14:44:51] NX-Wallace Wadge: others are card payees
 * [07/01/2016 14:45:20] NX-Wallace Wadge: bank payees we need to keep track of branch name
 * [07/01/2016 14:45:29] NX-Wallace Wadge: card payees need to keep track of their card numbers
 * [07/01/2016 14:45:38] NX-Wallace Wadge: for both, we need to track their names
 * [07/01/2016 14:46:01] NX-Wallace Wadge: capture that behaviour in classes
 */

public abstract class Payees {
    String name;

    public void setName(String payeeName) {
        this.name = payeeName;
    }

}
