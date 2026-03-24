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
    private String email;
    private int telefone;
    private int anosDeIngresso;
    private int semestreDeIngresso;
    private String situacaoAcademica;
    private String digito;
    private String nivelEnsino;

    public Estudante() {
        nome = "Nobody";
    }

    private int obterIdade(Date hoje) {
        int idade = 0;
        //Logica de calculo de idade
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }

    public Date getData() {
        return dataNascimento;
    }

    public void setData(Date _data) {
        dataNascimento = _data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String _cpf) {
        cpf = _cpf;
    }

    public char getGenero() {
        return genero;
    }

    public void setGeneto(char _genero) {
        genero = _genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void settelefone(int _telefone) {
        telefone = _telefone;
    }

    public int getAnosDeIngresso() {
        return anosDeIngresso;
    }

    public void setAnosDeIngresso(int _anosDeIngresso) {
        anosDeIngresso = _anosDeIngresso;
    }

    public int getsemestreDeIngresso() {
        return semestreDeIngresso;
    }

    public void setsemestreDeIngresso(int _semestreDeIngresso) {
        semestreDeIngresso = _semestreDeIngresso;
    }

    public String getsituacaoAcademica() {
        return situacaoAcademica;
    }

    public void setsituacaoAcademica(String _situacaoAcademica) {
        situacaoAcademica = _situacaoAcademica;
    }

    public String getnivelEnsino() {
        return situacaoAcademica;
    }

    public void setnivelEnsino(String _nivelEnsino) {
        nivelEnsino = _nivelEnsino;
    }

    public String getdigito() {
        return situacaoAcademica;
    }

    public void setdigito(String _digito) {
        digito = _digito;
    }

    public String getmatricula() {
        return String.valueOf(anosDeIngresso) + String.valueOf(semestreDeIngresso) + digito;
    }

    public void setmatricula(String _digito) {
        digito = _digito;
    }
}
