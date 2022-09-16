package aplication;

import Aplication.DTO.Equipo;
import aplication.DTO.Usuarios;


public class Main {

    
    public static void main(String[] args) {
        
        System.out.println("Creando Usuarios...");
        Usuarios c = new Usuarios();
        
        c.setId(1874);
        c.setNombreCompleto("Raul");
        c.setRut(20908763);
        c.setDv ("k");
        c.setTelefono (982608976);
        c.setEmail("raulval@gmail.com");
        c.setContrasena("vivachile123");
        c.setNombreUsuario ("dcog");
        
        System.out.println("Su Id es: "+c.getId());
        System.out.println("su nombre es: "+c.getNombreCompleto());
        System.out.println("su telefono es: "+ c.getTelefono());
        System.out.println("su rut es: "+c.getRut());
        System.out.println("Su nombre de usuario es: "+c.getNombreUsuario());
        System.out.println("Su Email es: "+c.getEmail());
        System.out.println("========================");
        System.out.println("Inscripcion de equipos");
        Equipo p = new Equipo();
        p.setNombreClub("Manquehue City");
        p.setNombreFundador("Juanito");
        p.setPaisOrigen("Chile");
        p.setLema("El que no arriesga no gana");
        p.setColores("azul y Rojo");
        p.setValorSubscripcion(15100);
        System.out.println("========================");
        System.out.println("Nombre del club: "+p.getNombreClub());
        System.out.println("Fundador: "+p.getNombreFundador());
        System.out.println("Pais de origen: "+p.getPaisOrigen());
        System.out.println("Lema del club: "+p.getLema());
        System.out.println("Color de equipacion: "+p.getColores());
        System.out.println("Valor de inscripcion: $"+p.getValorSubscripcion());
 
                       
        
    }
    
}
