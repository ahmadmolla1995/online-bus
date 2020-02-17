package onlineBusTicket.service.signup;


public interface SignUpUseCase {
    void signUp(String username, String password, String firstName, String lastName);
}
