package co.com.microservices.app.controller;

import co.com.microservices.app.model.Client;
import co.com.microservices.app.model.ClientFactory;
import co.com.microservices.app.repository.ClientRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Component
public class ClientController implements ClientFactory {


    private final  ClientRepository clientRepository;


     ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    public Mono<Void> save(Client client) {
        return Mono.just(client)
                .flatMap(clientRepository::save).then();

    }


    public Flux<Client> findAll() {
        return clientRepository.findAll();
    }


}
