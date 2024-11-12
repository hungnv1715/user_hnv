package userservice.user_hnv;


import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.mongo.config.annotation.web.http.EnableMongoHttpSession;

@Configuration
@EnableMongoHttpSession(maxInactiveIntervalInSeconds = 300,collectionName = "hnv_sesion")
public class MongoConfig {

}
