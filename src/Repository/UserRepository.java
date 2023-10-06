
package Repository;

import DataAcess.UserDAO;


public class UserRepository implements IUserRepository{
    @Override
    public void createNewAccount() {
        UserDAO.Instance().createNewAccount();
    }

    @Override
    public void loginSystem() {
        UserDAO.Instance().loginSystem();
    }
}
