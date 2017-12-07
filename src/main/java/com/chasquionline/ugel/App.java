package com.chasquionline.ugel;

import com.chasquionline.ugel.bean.Empleado;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = format.parse("14/05/1998");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(date.toString());

        Empleado empleado = new Empleado();

        empleado.setNombre("Kevin Nick");
        empleado.setApellidos("Pascual Tuesta");
        empleado.setDni("76983934");
        empleado.setCelular("975140822");
        empleado.setEmail("k_npc2009@hotmail.com");
        empleado.setFechaNacimiento(date);
        empleado.setSituacion("Director");
        empleado.setModalidad("Gestor");
        empleado.setNivel("V");
        empleado.setGestion("Primaria");
        empleado.setEscala(1);


        System.out.println( "Hello World!" );
    }
}
