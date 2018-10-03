package event.repository;

import event.protocol.ProtocolProvider;

import java.util.List;

import commons.dao.Event;

public class RemoteEventRepository implements EventRepository<Event> {

    private ProtocolProvider protocolProvider;

    public RemoteEventRepository(ProtocolProvider protocolProvider) {
        this.protocolProvider = protocolProvider;
    }

    @Override
    public List<Event> fetchEvents() {
        return protocolProvider.fetchEvents();
    }
}