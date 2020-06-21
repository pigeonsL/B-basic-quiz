package tw.gtb.quiz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tw.gtb.quiz.Education;
import tw.gtb.quiz.User;
import tw.gtb.quiz.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id")long id){
        User user = userService.find(id);
        return user;
    }
    @GetMapping("/users/{id}/educations")
    public Education getUserEducation(@PathVariable("id")long id){
        Education education = userService.findUserEducation(id);
        return education;
    }
}