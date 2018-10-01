package first.event.service.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import commons.enums.EventType;

public interface EventMongoRepository extends MongoRepository<MongoDocument, String> {

    MongoDocument findByEventType(EventType eventType);
}