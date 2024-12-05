package org.lary.demo.controller;

import org.lary.demo.model.Appointment;
import org.lary.demo.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppointmentController {

    @Autowired
    private AppointmentRepository repository;

    @PostMapping("guardar")
    public String saveAppointment(@ModelAttribute("appointment") Appointment newAppointment){

        System.out.println(newAppointment);

        repository.save(newAppointment);

        // Redirige a la página principal
        return "redirect:/";
    }

    @PostMapping("eliminar2/{id}")
    public String deleteBuyer(@PathVariable Integer id){
        repository.deleteById(id);
        return "redirect:/";
    }
}
