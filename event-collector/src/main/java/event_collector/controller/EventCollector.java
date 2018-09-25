package event_collector.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Collections.emptyList;

@RestController
@RequestMapping("event")
public class EventCollector {

    public List<Object> collectEvents() {

        return emptyList();
    }
}