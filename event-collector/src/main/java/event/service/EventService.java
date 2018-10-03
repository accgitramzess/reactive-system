package event.service;

import event.repository.EventRepository;

import java.util.List;

import commons.dao.Event;

public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> collectEvents() {
        return eventRepository.fetchEvents();
    }
}