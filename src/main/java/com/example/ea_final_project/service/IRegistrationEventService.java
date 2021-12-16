package com.example.ea_final_project.service;

import com.example.ea_final_project.model.Faculty;
import com.example.ea_final_project.model.RegistrationEvent;

import java.util.List;

public interface IRegistrationEventService {
     List<RegistrationEvent> findAll();
     RegistrationEvent findById(Integer id) ;
     RegistrationEvent create(RegistrationEvent registrationEvent);
     RegistrationEvent update(Integer id, RegistrationEvent registrationEvent);
     void deleteById(Integer eventId);

     RegistrationEvent findFirstEvent();
}
