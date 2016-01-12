package HomeWork.Store;

/**
 * Created by mcachia on 06/01/2016.
 */
public class CD extends Item {

    String band;
    String manager;

    public CD(String band) {
        this.band = band;
    }

    public CD(String band, String manager) {
        this.band = band;
        this.manager = manager;
    }

    @Override
    public void sell() {
        sell(1);
        System.out.println("CD was sold.");
    }

    public String getBand() {

        return band;
    }

    public void setBand(String band) {

        this.band = band;
    }

    public String getManager() {

        return manager;
    }

    public void setManager(String manager) {

        this.manager = manager;
    }


}
