package onlineBusTicket.repositories;

import onlineBusTicket.model.User;


public class UserRepository extends CRUDRepository<User, Long> {
    private static UserRepository userRepository;

    private UserRepository() {}

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }

    public static UserRepository getInstance() {
        if (userRepository == null)
            userRepository = new UserRepository();
        return userRepository;
    }
}
