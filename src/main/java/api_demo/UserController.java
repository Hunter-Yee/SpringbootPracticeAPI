package api_demo;

import tools.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public JsonNode getUser(@PathVariable int id) {
        return userService.getUser(id);
    }
    // Ex: http://localhost:8081/api/users/1

    @GetMapping
    public JsonNode getAllUsers() {
        return userService.getAllUsers();
    }
    // Ex: http://localhost:8081/api/users
}
