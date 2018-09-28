package first.event.service.service2;

import org.springframework.stereotype.Service;

import java.util.List;

import commons.dao.Event;

import static java.util.Collections.emptyList;

@Service
public class EventMongoService {

    public List<Event> collectEvents() {
        return emptyList();
    }
}