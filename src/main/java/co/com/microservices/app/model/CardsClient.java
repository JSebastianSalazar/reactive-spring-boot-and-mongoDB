package co.com.microservices.app.model;


import lombok.*;

@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CardsClient {

    private String numberAccount;
    private String ccv;
    private String typeCards;
   // private List<Consumption> consumption;


}
