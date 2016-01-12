package HomeWork.HW2;

/**
 * Created by mcachia on 08/01/2016.
 */
public abstract class FinancialEvent extends Event {
    float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
