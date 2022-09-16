package aplication.DTO;

import java.util.Date;
import java.util.Scanner;
import java.util.Date;

public class Usuarios {
    
        
    private int Id;
    private String NombreCompleto;
    private int Rut;
    private String Dv; 
    private Date FechaNacimiento;
    private int Telefono;
    private String Email;
    private String NombreUsuario;
    private String Contrasena;

    public String getContrasena() {
        return Contrasena;
    }

    public Usuarios(){
        this.Id = 0;
        this.NombreCompleto = "";
        this.Rut = 0;
        this.Dv = "";
        this.FechaNacimiento = new Date ();
        this.Telefono = 0;
        this.Email = "";
        this.NombreUsuario = "";
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public Usuarios(int Id, String NombreCompleto, int Rut, String Dv, Date FechaNacimiento, int Telefono, String Email, String NombreUsuario) {
        this.Id = Id;
        this.NombreCompleto = NombreCompleto;
        this.Rut = Rut;
        this.Dv = Dv;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Email = Email;
        this.NombreUsuario = NombreUsuario;
    }
    
        public void setTelefono(int Telefono) {
        StringBuilder sb = new StringBuilder();
        sb.append(Telefono);
        
        if(sb.length() > 7){
            this.Telefono = Telefono;
        }
    }
    
    
    public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
        
            final int MAX = 6;
        
            final int MAYUSCULAS = 1;
            final int MinimoMayusculas=1;
            final int DigitosContra=6;
            int ContadorMayus=0;
            int ContadorMinus=0;
            int ContadorDigitos=1;
            
        System.out.println();    
        System.out.println("======================");
System.out.println("Ingrese su contrasena: ");
System.out.println("======================");

        
Scanner input = new Scanner(System.in);
        
String Contra = input.nextLine();
               
            for (int i=0; i < Contra.length(); i++ ) {
                   char a = Contra.charAt(i);
                   if(Character.isUpperCase(a)) 
                        ContadorMayus++;
                    else if(Character.isLowerCase(a))
                        ContadorMinus++;
                    else if(Character.isDigit(a)) 
                        ContadorDigitos++;                                                          
    } 

        this.Contrasena = Contrasena;
    }
    
    




    
}
