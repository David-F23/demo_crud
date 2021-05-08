package demo;

import java.sql.SQLException;

/**
 *
 * @author Sam-Chorro
 */
public class Read {
    
    public Read() throws SQLException{
        System.out.println("---CONSULTA DE REGISTROS--");
        MostrarResultados();
    }
    
    private void MostrarResultados() throws SQLException{
     
        try{
            ConexionCRUD utilerias = new ConexionCRUD();
            String Tabla= "tb_contacto";
            String camposTabla= "*";
            
            String condicionBusqueda= "";
            
            utilerias.desplegarRegistros(Tabla, camposTabla, condicionBusqueda);
            
        }catch(SQLException ex){
        System.out.println("Ha ocurrido el siguiente error: "+ex.getMessage());
        }
    }
}
