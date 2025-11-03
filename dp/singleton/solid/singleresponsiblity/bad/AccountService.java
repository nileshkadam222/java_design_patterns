package testing.streams.Design.dp.singleton.solid.singleresponsiblity.bad;

import testing.streams.Design.dp.singleton.solid.singleresponsiblity.Account;

public class AccountService {

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

    //This  method is break the single responsiable principle
    public String  deposit(){
        return "Deposited";
    }
}
