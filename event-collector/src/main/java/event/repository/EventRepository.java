package event.repository;

import java.util.List;

public interface EventRepository<T> {

    List<T> fetchEvents();
}