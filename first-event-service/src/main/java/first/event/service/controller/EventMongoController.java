package first.event.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import commons.dao.Event;

import first.event.service.service2.EventMongoService;

@RestController
@RequestMapping("info")
public class EventMongoController {

    private EventMongoService service;

    @Autowired
    public void setService(EventMongoService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/events", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Event> collectEvents() {
        return service.collectEvents();
    }
}