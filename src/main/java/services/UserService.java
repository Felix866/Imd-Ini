package services;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import repositories.UserRepository;
import security.LoginService;
import security.UserAccount;

import java.util.Collection;

@Service
@Transactional
public class UserService {

    // Managed repository -----------------------------------------------------

    @Autowired
    private UserRepository userRepository;

    // Supporting services ----------------------------------------------------

    @Autowired
    private UserAccountService userAccountService;

    @Autowired
    private ActorService actorService;

    // Constructors -----------------------------------------------------------

    public UserService() { super(); }

    // Simple CRUD methods ----------------------------------------------------

    public User create() {
        User result;

        result = new User();
        result.setUserAccount(this.userAccountService.create("USER"));
        return result;
    }

    public User findOne(final int userId) {

        User result;
        result = this.userRepository.findOne(userId);
        return result;
    }

    public Collection<User> findAll() {

        Collection<User> result;
        result = this.userRepository.findAll();
        return result;
    }

    public User save(User user) {
        Assert.notNull(user);
        User result;

        if(user.getId()==0){
            result = userRepository.save(user);
        }else {
            result = this.userRepository.save(user);
        }
        return result;
    }

    // Other business methods -----------------------------------------------------------------

    public User findByPrincipal() {

        User result;
        UserAccount userAccount = LoginService.getPrincipal();
        result = this.findByUserAccountId(userAccount.getId());
        return result;
    }


    public User findByUserAccountId(int userAccountId) {

        User result;
        result = this.userRepository.findByUserAccountId(userAccountId);
        return result;
    }

}