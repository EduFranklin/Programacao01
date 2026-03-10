/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifc.eduardo;

import java.util.Date;

/**
 *
 * @author Eduardo
 */
public class Estudante {
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;

    public Estudante(){
        nome = "Nobody";
    }

    private int obterIdade(Date hoje){
        int idade = 0;
        //Logica de calculo de idade
        return idade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String _nome){
        nome = _nome;
    }
    
    
    public Date getData(){
        return dataNascimento;
    }
    public void setData(Date _data){
        dataNascimento = _data;
    }
    
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String _cpf){
        cpf = _cpf;
    }
    
    
    public char getGenero(){
        return genero;
    }
    public void setGeneto(char _genero){
        genero = _genero;
    }
    
    
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String _matricula){
        matricula = _matricula;
    }
    
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String _email){
        email = _email;
    }
}
