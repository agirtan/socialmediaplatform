package com.example.demo.service;

import com.example.demo.entities.Event;
import com.example.demo.repository.EventRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

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

//    public List<Event> getEventByLocation(String locatie){
//        return eventRepository.findByLocation(locatie);
//    }
}
