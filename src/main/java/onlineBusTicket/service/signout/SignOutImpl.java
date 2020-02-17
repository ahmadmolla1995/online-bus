package onlineBusTicket.service.signout;

import onlineBusTicket.config.AuthenticationService;
import onlineBusTicket.model.User;
import onlineBusTicket.repositories.UserRepository;


public class SignOutImpl implements SignOutUseCase {
    @Override
    public void signOut(String username) {
        User user = UserRepository.getInstance().findByAttribute("username", "\'" + username + "\'");
        AuthenticationService authenticationService = AuthenticationService.getInstance();

        if (authenticationService.getLoginUser() != null) {
            if (authenticationService.getLoginUser().getUsername().equals(user.getUsername()))
                authenticationService.removeLoginUser();
        }
    }
}
