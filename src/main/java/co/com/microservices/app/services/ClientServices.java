package co.com.microservices.app.services;


import co.com.microservices.app.controller.ClientController;
import co.com.microservices.app.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api_client")
public class ClientServices {

    @Autowired(required = true)
    private ClientController clientController;



    @PostMapping("/save")
    @CrossOrigin(value = "*")
    public Mono<Void> save(@RequestBody Client client) {
        return clientController.save(client);
    }

    @GetMapping("/status")
    public Flux<Client> status() {
        return clientController.findAll();}



}
