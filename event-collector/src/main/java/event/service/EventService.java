package event.service;

import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Collections.emptyList;

@Service
public class EventService {

    public List<Object> collectEvents() {
        return emptyList();
    }
}