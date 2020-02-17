package onlineBusTicket.service.signup;

import onlineBusTicket.model.User;
import onlineBusTicket.repositories.UserRepository;


public class SignUpImpl implements SignUpUseCase {
    @Override
    public void signUp(String username, String password, String firstName, String lastName) {
        UserRepository repository = UserRepository.getInstance();
        repository.save(new User(null, username, password, firstName, lastName));
    }
}
