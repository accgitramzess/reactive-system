package event.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import event.protocol.HttpProtocolProvider;
import event.repository.RemoteEventRepository;
import event.service.EventService;

@Configuration
public class EventCollectorConfiguration {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public EventService eventService() {
        return new EventService(new RemoteEventRepository(new HttpProtocolProvider(restTemplate)));
    }
}