package pl.project.Sklep;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jedendwa")
public class Example {
    @GetMapping(path= "trzy/{id}", produces = "application/json")
    public String getBook(@PathVariable int id) {
        return "hello World " + id;
    }

    @GetMapping(path= "dwa/{id}", produces = "application/json")
    public ResponseEntity<String> getBooki(@PathVariable int id) {

        if (id == 2){
            return   ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Nieprawidłowy login lub hasło");
        } else {
            return   ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body("Zalogowano");
        }

    }

}