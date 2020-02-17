package onlineBusTicket.service.signin;

import onlineBusTicket.config.AuthenticationService;
import onlineBusTicket.model.User;
import onlineBusTicket.repositories.UserRepository;


public class SignInImpl implements SignInUseCase {
    @Override
    public void signIn(String username, String password) {
        AuthenticationService authenticationService = AuthenticationService.getInstance();
        if (authenticationService.getLoginUser() == null) {
            User user = UserRepository.getInstance().findByAttribute("username", "\'" + username + "\'");
            authenticationService.setLoginUser(user);
        }
    }
}
