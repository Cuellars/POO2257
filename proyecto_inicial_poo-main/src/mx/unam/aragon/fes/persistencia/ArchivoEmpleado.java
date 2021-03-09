package mx.unam.aragon.fes.persistencia;

import java.util.ArrayList;
import mx.unam.aragon.fes.Empleado;

/**
 *
 * @author Rsin
 */
public class ArchivoEmpleado {
    private String archivo;

    public ArchivoEmpleado() {
    }

    public ArchivoEmpleado(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    public void guardarEmpleados(ArrayList<Empleado> datos)
    {
        //aquí el código para grabar el disco duro
    }
    
    public ArrayList<Empleado> leerEmpleados()
    {
        ArrayList<Empleado> tmp = null;
        //Leer del disco duro
        //Se sube a un ArrayList
        
        return tmp;
    }
    
}
