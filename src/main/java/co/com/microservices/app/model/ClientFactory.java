package co.com.microservices.app.model;


import java.util.UUID;

public interface ClientFactory {

    default String generateNumberAccount(){
        return UUID.randomUUID().toString();
    }


    default Client saveClientsave(Client client){
        return Client.builder()
                .idCliente(generateNumberAccount())
                .phone(client.getPhone())
               // .cardsClients(client.getCardsClients())
                .name(client.getName())
                .address(client.getAddress())
                .build();

    }

}
