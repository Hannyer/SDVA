/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Conexion.SNMPExceptions;
import DAO.UsuarioDLL;
import Model.Cliente;
import Model.Tipo.TipoUsuario;
import Model.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.faces.model.SelectItem;
import javax.naming.NamingException;

/**
 *
 * @author Usuario
 */
@Named(value = "beanCliente")
@SessionScoped
public class BeanCliente implements Serializable {

    Usuario usuario=new Cliente();
    
    public BeanCliente() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    public void insertarCliente() throws NamingException, SNMPExceptions, SQLException, ClassNotFoundException{
    
    UsuarioDLL.insertarCliente(usuario);
    }
    
    
    public LinkedList <SelectItem> listaTipoUsuario() throws SNMPExceptions{
    LinkedList lista=new LinkedList();
        
        for (TipoUsuario o : UsuarioDLL.listaTipoUsuario()) {
            lista.add(new SelectItem(o.getDescripcion()));
        }
    
    return lista;
    }
    
    
}
