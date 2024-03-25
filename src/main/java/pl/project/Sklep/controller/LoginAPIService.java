package pl.project.Sklep.controller;

import org.springframework.web.bind.annotation.*;
import pl.project.Sklep.model.Login;

@RestController
@RequestMapping("/login")
public class LoginAPIService
{
    Login login;

    @GetMapping("/{login}")
    public Login getLogin(@PathVariable("login") String login)
    {
        return new Login(login, "zaq1@WSX");
    }
    @PostMapping
    public String createLoginDetails(@RequestBody Login login)
    {
        this.login = login;
        return "user created";

    }
}
