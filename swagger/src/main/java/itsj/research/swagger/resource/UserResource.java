package itsj.research.swagger.resource;

import io.swagger.annotations.Api;
import itsj.research.swagger.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
@Api(value = "User Resource REST Endpoint", description = "describe the user resource")
public class UserResource {

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User("Sam", 2000L),
                new User("Peter", 1000L)
        );
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName) {
        return new User(userName, 1000L);
    }
}
