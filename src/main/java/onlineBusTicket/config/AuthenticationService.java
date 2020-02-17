package onlineBusTicket.config;

import onlineBusTicket.model.User;


public class AuthenticationService {
    private static AuthenticationService authenticationService;
    private User loginUser;

    private AuthenticationService() {}


    public static synchronized AuthenticationService getInstance() {
        return authenticationService;
    }

    public void setLoginUser(User user) {
        this.loginUser = user;
    }

    public void removeLoginUser() {
        this.loginUser = null;
    }

    public User getLoginUser() {
        return loginUser;
    }
}
