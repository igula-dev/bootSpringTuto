package dev.igula.tutorial;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clients")

public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientService.allClients();
        System.out.println(clients);
        return ResponseEntity.ok(clients); // Simplified response
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Client>> getSingleClient(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Client>>(clientService.singleClint(id), HttpStatus.OK);
    }

    @GetMapping("/msg")
    public ResponseEntity<String> getMsg(){
        return new ResponseEntity<String>("hello <h2>Yurii</h2>", HttpStatus.OK);
    }
}
