package co.com.microservices.app.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface Advisors extends ReactiveCrudRepository<Advisors, String> {
}
