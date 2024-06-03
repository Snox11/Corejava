package Projects.ATM;
/*: represents in-memory database that contains the objects of Account
class representing each person’s account. */
public class Bank_Database {

static Account ac=new Account();
    Bank_Database(){
        ac.Account_num=1111;
        ac.pin=1000;
        Account.available_balance=1000;
        Account.total_balance=1000;
    }
}
