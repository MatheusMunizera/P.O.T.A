/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeautomovel;

/**
 *
 * @author munizera
 */
public class Automovel {
    String nomeDoProprietario;
    String modelo;
    String placa;
    int ano;
    
    public Automovel(String nomeDoProprietario, String modelo, String placa, int ano ){
        this.nomeDoProprietario = nomeDoProprietario;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

   
    
    // Getters
    public String getNomeDoProprietario() { return nomeDoProprietario; }
    public String getModelo() { return modelo; }
    public String getPlaca() { return placa; }
    public int getAno() { return ano;}    
    
    //Setters
    public void setNomeDoProprietario(String nomeDoProprietario ) { this.nomeDoProprietario = nomeDoProprietario;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setPlaca(String placa) {this.placa = placa;}
    public void setAno(int ano) {this.ano = ano;}

    //
    public String getAll(){
    return "Nome: " + nomeDoProprietario + "\n"
            + "Modelo: " + modelo + "\n"
            + "Placa: " + placa + "\n"
            + "Ano: " + ano;
    
    }
   
}
