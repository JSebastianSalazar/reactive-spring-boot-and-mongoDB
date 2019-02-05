package co.com.microservices.app.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
@Document(collection = "Advisors")
public class Advisors {
    @Id
    private String id;
    private String name;
    private String specialty;


}
