package co.com.microservices.app.repository;

import co.com.microservices.app.model.Client;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveCrudRepository<Client, String> {
}
