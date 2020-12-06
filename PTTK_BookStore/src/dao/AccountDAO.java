
package dao;

import model.Account;


public interface AccountDAO extends BaseDAO<Account> {

    Account checkAccount(Account t);

    boolean checkUsernameExist(String username);
}
