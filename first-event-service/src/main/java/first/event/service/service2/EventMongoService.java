package first.event.service.service2;

import org.springframework.stereotype.Service;

import java.util.List;

import commons.dao.Event;

import first.event.service.mongo.MongoDocument;
import first.event.service.mongo.EventMongoRepository;

import static commons.dao.Event.*;
import static java.util.stream.Collectors.toList;

@Service
public class EventMongoService {

    private EventMongoRepository repository;

    public EventMongoService(EventMongoRepository repository) {
        this.repository = repository;
    }

    public List<Event> collectEvents() {
        return repository
                .findAll()
                .stream()
                .map(this::mapData)
                .collect(toList());
    }

    private Event mapData(MongoDocument mongoDocument) {
        return EventBuilder
                .builder()
                .setEventType(mongoDocument.getEventType())
                .setEventValue(mongoDocument.getEventValue())
                .build();
    }
}