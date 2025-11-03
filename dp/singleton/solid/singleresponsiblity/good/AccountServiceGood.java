package testing.streams.Design.dp.singleton.solid.singleresponsiblity.good;

import testing.streams.Design.dp.singleton.solid.singleresponsiblity.Account;

public class AccountServiceGood {
    public String  createAccount(Account account){
        //
        return "Created";
    }

    public String  updateAccount(Account account){
        //
        return "Updated";
    }
    public String  deleteAccount(Account account){
        //
        return "Deleetd";
    }
}
