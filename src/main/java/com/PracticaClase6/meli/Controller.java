package com.PracticaClase6.meli;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;


@RestController
@RequestMapping("/lacasa")
public class Controller
{
    @PostMapping ("/metrosCuadradoCasa")
    public double metrosCuadradoCasa(@RequestBody Casa casa){
        return casa.metrosCasa();
    }
    @PostMapping ("/valorCasa")
    public double valorCasa(@RequestBody Casa casa){
        return casa.valorCasa();
    }
    @PostMapping ("/mayorCasa")
    public Habitacion mayorCasa(@RequestBody Casa casa){
        return casa.habMasGrande();
    }
    @PostMapping ("/habPorMetroCuadrado")
    public ArrayList<Habitacion> habPorMetroCuadrado(@RequestBody Casa casa){
        return casa.getHabitaciones();
    }

}
