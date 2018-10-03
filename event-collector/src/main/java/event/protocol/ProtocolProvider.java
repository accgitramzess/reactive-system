package event.protocol;

import java.util.List;

public interface ProtocolProvider<T> {

    List<T> fetchEvents();
}