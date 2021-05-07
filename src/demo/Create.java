/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author df224
 */
public class Create {
    
    Create() throws SQLException{
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("<<  REGISTRAR PERSONA  >>");
        
        System.out.println("Carnet:");
        String carnet = leer.nextLine();
        
        System.out.println("Nombre:");
        String nombre = leer.nextLine();
        
        System.out.println("Apellido:");
        String apellido = leer.nextLine();
        
        System.out.println("Edad:");
        int edad = leer.nextInt();
        
        String tabla = "tb_estudiante";
        String camposTabla = "carnet_estudiante, nom_estudiante, ape_estudiante, edad_estudiante";
        String valoresCampos = "'" + carnet + "','" + nombre + "','" + apellido + "','" + edad + "'";
        
        ConexionCRUD utilerias = new ConexionCRUD();
        
        utilerias.guardarRegistros(tabla, camposTabla, valoresCampos);
        
    }
    
}
