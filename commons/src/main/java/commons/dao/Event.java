package commons.dao;

import commons.enums.EventType;
import commons.enums.EventValue;

public class Event {

    private EventType eventType;

    private EventValue eventValue;

    private Event(EventType eventType, EventValue eventValue) {
        this.eventType = eventType;
        this.eventValue = eventValue;
    }

    public static class EventBuilder {

        private EventType eventType;

        private EventValue eventValue;

        public static EventBuilder builder() {
            return new EventBuilder();
        }

        public EventBuilder setEventType(EventType eventType) {
            this.eventType = eventType;
            return this;
        }

        public EventBuilder setEventValue(EventValue eventValue) {
            this.eventValue = eventValue;
            return this;
        }

        public Event build() {
            return new Event(eventType, eventValue);
        }
    }
}