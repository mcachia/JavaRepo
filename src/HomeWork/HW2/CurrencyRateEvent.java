package HomeWork.HW2;

/**
 * Created by mcachia on 08/01/2016.
 */
public class CurrencyRateEvent extends Event {
    float currencyRate;

    public void getCurrencyRate(float currencyRate){
        this.currencyRate = currencyRate;
    }

    public void setCurrencyRate(float currencyRate) {
        this.currencyRate = currencyRate;
    }

}
