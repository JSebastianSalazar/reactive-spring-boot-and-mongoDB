package co.com.microservices.app.app;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories("co.com.microservices.app.repository")
public class MongoConfiguration  extends AbstractReactiveMongoConfiguration {

    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create("mongodb://sebastiansalazar:123456M@ds033740.mlab.com:33740/bancopruebaibm");
    }

    @Override
    protected String getDatabaseName() {
        return "bancopruebaibm";
    }
}
