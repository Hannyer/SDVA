
/*
 * To change this license header, choose License Headers in Project Propert

* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DAO.Conexion.AccesoDatos;
import DAO.Conexion.SNMPExceptions;
import Model.Usuario;
import java.sql.SQLException;
import javax.naming.NamingException;

/**
 *
 * @author Usuario
 */
public class UsuarioDLL {
    
    
    
 public static int insertarUsuario(Usuario usuario) throws SNMPExceptions, SQLException, NamingException, ClassNotFoundException{
 String procedure1="insert into usuario (id) values ("+usuario.getId()+")";
     AccesoDatos datos=new AccesoDatos();
     return datos.ejecutaSQL(procedure1);
 
 
 }
    
    
    
}
