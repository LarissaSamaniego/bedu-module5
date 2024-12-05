package org.lary.demo.controller;

import org.lary.demo.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.lary.demo.model.Appointment;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private AppointmentRepository repository;

    @GetMapping()
    public String index(Model model){
        /* http://localhost:8080 */
        Appointment appointment = new Appointment();
        List<Appointment> appointments = repository.findAll();

        model.addAttribute("appointment", appointment);
        model.addAttribute("appointments", appointments);

        return "index.html";
    }
}
