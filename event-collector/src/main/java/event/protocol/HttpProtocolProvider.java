package event.protocol;

import org.springframework.web.client.RestTemplate;

import java.util.List;

import commons.dao.Event;

public class HttpProtocolProvider implements ProtocolProvider<Event> {

    private RestTemplate restTemplate;

    public HttpProtocolProvider(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Event> fetchEvents() {
        return restTemplate.exchange(
                baseUrl + uri,
                HttpMethod.GET,
                new HttpEntity(headers),
                new ParameterizedTypeReference<List<T>>() {}, variables
        );
    }
}