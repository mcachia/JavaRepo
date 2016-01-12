package HomeWork.PegasusHW1;

/**
 * Created by mcachia on 07/01/2016.
 */
public class Bank extends Payees {

    String branchName;

    private void Bank(String branchName) {
        this.branchName = branchName;

    }


    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}

