package com.PracticaClase6.meli;

import java.util.ArrayList;

public class Casa
{
    private String nombre;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Casa(String nombre, ArrayList<Habitacion> habitaciones, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = habitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double metrosCasa(){
        double m = 0;
        for(Habitacion h:this.habitaciones){
            m += h.getMetroCuadrado();
        }
        return m;
    }

    public double valorCasa ()
    {
        return metrosCasa()*800;
    }

    public Habitacion habMasGrande(){
        Habitacion masGrande= new Habitacion();
        double areaMasGrande = 0;
        for(Habitacion h:this.habitaciones){
            if (h.getMetroCuadrado()>areaMasGrande) {
                masGrande = h;
                areaMasGrande = h.getMetroCuadrado();
            }
        }
        return masGrande;
    }

    //public Habitacion[] areaHabitaciones(){
      //  Habitacion masGrande= new Habitacion();
        //for(Habitacion h:this.habitaciones){
          //      masGrande = h;

        //}
        //return masGrande;
   // }

    //
}
