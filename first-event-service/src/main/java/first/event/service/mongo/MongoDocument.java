package first.event.service.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import commons.enums.EventValue;
import commons.enums.EventType;

@Data
@NoArgsConstructor
@Document(collection = "events")
public class MongoDocument {

    @Id
    private Long id;

    private Date time;

    private EventType eventType;

    private EventValue eventValue;
}