/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.eduardo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Turma {
    
    private Estudante estudante = new Estudante();
    private Professor professor = new Professor();
    private Disciplina disciplina = new Disciplina();
    
    private Set<Estudante>estudantes = new HashSet<Estudante>();
    private Set<Professor>professores = new HashSet<Professor>();
    private Set<Disciplina>disciplinas = new HashSet<Disciplina>();
    
    
    
}
