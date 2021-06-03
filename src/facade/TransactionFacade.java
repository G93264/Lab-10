package facade;

import com.company.NewBankAccount;

public class TransactionFacade {

    //Initializing?
    AtmAds atmAds = new AtmAds();
    AtmUserLog atmUserLog = new AtmUserLog();
    AtmStatus atmStatus = new AtmStatus();

    //CREATING NEW BANK ACCOUNT
    NewBankAccount bank1 = new NewBankAccount(100);

    public int Debit(int i){
        atmAds.showAds();
        bank1.debit(i);
        atmUserLog.SaveUserLog();
        atmStatus.saveAtmStatus();

        //return balance
        return bank1.balance();
    };

    public int Credit(int i){
        atmAds.showAds();
        bank1.credit(i);
        atmUserLog.SaveUserLog();
        atmStatus.saveAtmStatus();

        //return balance
        return bank1.balance();

    };

}
