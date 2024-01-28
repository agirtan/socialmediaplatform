package com.example.demo.controller;

import com.example.demo.entities.Event;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.EventService;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    private EventService eventService;

    @GetMapping("/search")
    private List<Event> GetEventByName (@RequestParam String numeCautat){
        return eventService.getEventByName(numeCautat);
    }

//    @GetMapping("/searchLocation/{location}")
//    public List<Event> findByLocation(@PathVariable String location) {
//        return eventService.getEventByLocation(location);
//    }


}
