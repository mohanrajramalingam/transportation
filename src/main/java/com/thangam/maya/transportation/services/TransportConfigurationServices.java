package com.thangam.maya.transportation.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thangam.maya.transportation.Model.TransportationNames;

@RestController
public class TransportConfigurationServices {

    @GetMapping("/transdetails")
    public TransportationNames getTransportationNames() {
        return new TransportationNames();
    }

    @GetMapping("/transdetailsstring")
    public String getNames() {
        return "Hello My dear";
    }

}
