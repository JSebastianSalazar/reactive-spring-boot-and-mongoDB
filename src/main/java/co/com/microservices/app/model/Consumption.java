package co.com.microservices.app.model;


import lombok.*;

import java.util.Date;

@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Consumption {

    private Date consumptionDate;
    private String description;
    private String amount;

}