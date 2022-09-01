package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author j247487
 */
public class Cliente {
    //atributos
    
    private int rg_cli;
    private String nome_cli;
    private int tel_cli;
    private int end_cli;
    
    //construct
    
     public Cliente(int rg_cli, String nome_cli, int tel_cli, int end_cli) {
        this.rg_cli = rg_cli;
        this.nome_cli = nome_cli;
        this.tel_cli = tel_cli;
        this.end_cli = end_cli;
    }
    
    //get-setters
     
    public int getRg_cli() {
        return rg_cli;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    public int getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(int tel_cli) {
        this.tel_cli = tel_cli;
    }

    public int getEnd_cli() {
        return end_cli;
    }

    public void setEnd_cli(int end_cli) {
        this.end_cli = end_cli;
    }   
   
}
