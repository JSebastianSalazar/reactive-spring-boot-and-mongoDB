package co.com.microservices.app.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Client")
public class Client {

    @Id
    private String id;
    private String idCliente;
    private String name;
    private String address;
    private int phone;
   // private List<CardsClient> cardsClients;



}
