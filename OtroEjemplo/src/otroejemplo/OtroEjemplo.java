/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otroejemplo;

import ico.fes.per.Alumno;

/**
 *
 * @author CUELLAR
 */
public class OtroEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno c1=new Alumno();
        c1.setNombre("CUELLAR");
        c1.setEdad(20);
        c1.setGenero(0);
        c1.setAltura(1.63f);
        c1.setNumeroCuenta("318179221");
        c1.setCarrera("ICO");
        c1.setSemestre(2);
        
        Alumno c2=new Alumno("318179211", "Fisica", 2, "Montejano", 19, 2, 1.55f);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
    
}
