package service;

import entities.Event;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import repository.EventRepository;
import repository.UserRepository;

import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
    public List<Event> getEventByName(String numeCautat) {
      return eventRepository.findByName(numeCautat);
    }
    public List<Event> getEventByLocation(String locatie){
        return eventRepository.findByLocation(locatie);
    }


}
