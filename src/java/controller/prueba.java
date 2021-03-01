/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.Conexion.AccesoDatos;
import DAO.Conexion.SNMPExceptions;
import DAO.UsuarioDLL;
import Model.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import javax.naming.NamingException;

/**
 *
 * @author Jesus
 */
@Named(value = "prueba")
@SessionScoped
public class prueba implements Serializable {

    /**
     * Creates a new instance of prueba
     */
    private Usuario usuario=new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
public void agregar() throws SNMPExceptions, SQLException, NamingException, ClassNotFoundException{
    int n=UsuarioDLL.insertarUsuario(usuario);
    
            }
        
    
    public prueba() {
    }
    
}
