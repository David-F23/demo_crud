package demo;

import java.sql.*;

/**
 *
 * @author Giovanni López
 */
public class ConexionCRUD {
    
    private final String servidor = "Aqui tieene que ir la ruta de base de datos";
    
    private final String usuario = "aqui el usuario";
    
    private final String clave = "aqui la clave";
    
    private final String driverConector = "aqui el driver de conexión";
    
    private static Connection conexion;
    
    public ConexionCRUD(){
        
    }
    
    public Connection getConnetion(){
        return conexion;
    }
        
    public void guardarRegistros(String tabla, String camposTabla, String valoresCampos){
        
    }  
    public void actualizarEliminarRegistro(String tabla, String valoresCamposNuevos, String condicion){
        
    }
    
    public void desplegarRegistros(String tablaBuscar, String camposBuscar, String condicionBuscar) throws SQLException{
        
    }
}
