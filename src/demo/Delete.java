package demo;

import java.sql.SQLException;
import java.util.Scanner; 

public class Delete {
    
    Delete() throws SQLException {
        Scanner leer = new Scanner(System.in); 
        ConexionCRUD utilerias = new ConexionCRUD(); 
        System.out.println("<<ELIMINAR REGISTROS>>");
        
        System.out.println("Ingrese el ID del registro a eliminar: ");
        String idEstudianteEliminar = leer.next(); 
        
        String tabla = "tb_estudiante";
        String campos = "*"; 
        String condicion = "id_estudiante = " + idEstudianteEliminar; 
        
        utilerias.desplegarRegistros(tabla, campos, condicion);
        
        System.out.println("Presiona (S) para confimar");
        String confirmarBorrar = leer.next();
        
        if ("S".equals(confirmarBorrar)) {
            String valoresCamposNuevos = ""; 
            
            utilerias.actualizarEliminarRegistro(tabla, valoresCamposNuevos, condicion);
            
            System.out.println("REGISTRO ELIMINADO");
        }
        
        MenuPrincipal.desplegarMenu();
    }
    
}

