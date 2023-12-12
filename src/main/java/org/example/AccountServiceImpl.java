package org.example;


public class AccountServiceImpl implements AccountService{

    public static void main(String[] args) {
        User firstUser = new User(1, "James", "Smith");
        Account[] accounts = new Account[5];
        accounts[0] = new Account(1, 500, firstUser);
        accounts[1] = new Account(2, 1000, firstUser);
        accounts[2] = new Account(3, 1500, firstUser);
        accounts[3] = new Account(4, 2000, firstUser);
        accounts[4] = new Account(5, 2500, firstUser);
        AccountService service = new AccountServiceImpl(accounts);
        System.out.println(service.findAccountByOwnerId(2));
        System.out.println(service.countAccountsWithBalanceGreaterThan(2000));
    }

    Object[] accounts;
    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }
    // return account object for given id or return null if not exist
    public Account findAccountByOwnerId(long id) {
        for (Object account : this.accounts) {
            Account current = (Account) account;
            if (current.getId() == id) {
                return current;
            }
        }
        return null;
    }
    // return number of accounts with balance greater than provided value
    public long countAccountsWithBalanceGreaterThan(long value) {
        long numberOfAccounts = 0;
        for (Object account : this.accounts) {
            if (((Account) account).getBalance() > value) {
                numberOfAccounts += 1;
            }
        }
        return numberOfAccounts;
    }
}
