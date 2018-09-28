package event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import event.service.EventService;

@RestController
@RequestMapping("info")
public class EventController {

    private EventService eventService;

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/events", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Object> collectEvents() {
        return eventService.collectEvents();
    }
}