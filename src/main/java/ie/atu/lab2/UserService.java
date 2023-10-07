package ie.atu.lab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private EmailService emailService;
    @Autowired
    public UserService(EmailService emailService){
        this.emailService = emailService;
    }

    public void registerUser(String username,String email){
        emailService.SendEmail(email,"Welcome to our platform");
    }
}
