/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.util.logging.Logger;

/**
 *
 * @author j247487
 */
public class ClienteDAO extends DAO {
    private static ClienteDAO instansce;
    
    private ClienteDAO(){
        getConnection();
        createTable();
    }
    
    //CRUD
public Cliente create(int rg_cli, String nome_cli, int tel_cli, int end_cli){
   try {
         PreparedStatement stmt;
         stmt = DAO.getConnection().prepareStatement("INSERT INTO client rg_cli, nome_cli, tel_cli, end_cli");
         
   }catch{
         
     }      
    }
}


