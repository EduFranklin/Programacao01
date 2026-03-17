/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.eduardo;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Professor {
    private String nome;
    private int numeroDeIdentificacaoInstitucional;
    private String email;
    private int telefone;
    private String titulacaoAcademica;
    private String areaDeAtuacao;
    private int regimeDeTrabalhoNaInstituicao;
    private Date dataDeIngresso;
    
    
    public String getNome(){
        return nome;
    }
    public void setNome(String _nome){
        nome = _nome;
    }
    
    
    public int getnumeroDeIdentificacaoInstitucional(){
        return numeroDeIdentificacaoInstitucional;
    }
    public void setNome(int _numeroDeIdentificacaoInstitucional){
        numeroDeIdentificacaoInstitucional = _numeroDeIdentificacaoInstitucional;
    }
    
    
    public String getemail(){
        return email;
    }
    public void setemail(String _email){
        email = _email;
    }
    
    
    public int gettelefone(){
        return telefone;
    }
    public void settelefone(int _telefone){
        telefone = _telefone;
    }
    
    
    public String gettitulacaoAcademica(){
        return titulacaoAcademica;
    }
    public void settitulacaoAcademica(String _titulacaoAcademica){
        titulacaoAcademica = _titulacaoAcademica;
    }
    
    
    public String getareaDeAtuacao(){
        return areaDeAtuacao;
    }
    public void setareaDeAtuacao(String _areaDeAtuacao){
        areaDeAtuacao = _areaDeAtuacao;
    }
    
    
    public int getregimeDeTrabalhoNaInstituicao(){
        return regimeDeTrabalhoNaInstituicao;
    }
    public void setregimeDeTrabalhoNaInstituicao(int _regimeDeTrabalhoNaInstituicao){
        regimeDeTrabalhoNaInstituicao = _regimeDeTrabalhoNaInstituicao;
    }
    
    
    public Date getdataDeIngresso(){
        return dataDeIngresso;
    }
    public void setdataDeIngresso(Date _dataDeIngresso){
        dataDeIngresso = _dataDeIngresso;
    }
    
}
