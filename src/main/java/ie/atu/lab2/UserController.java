package ie.atu.lab2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping("/registerUser/{name}/{email}")
    public void getUser(@PathVariable String name,@PathVariable String email) {
        userService.registerUser(name,email);
    }
    @PostMapping("/registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public User userBody(@RequestBody User user){
    System.out.println("User Name: " + user.getName());
    System.out.println("User Email: " + user.getEmail());
    return user;
    }

}
