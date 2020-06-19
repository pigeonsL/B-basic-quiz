package tw.gtb.quiz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tw.gtb.quiz.User;

@RestController
public class UserController {
    @Autowired

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id")Integer id){
    }
}