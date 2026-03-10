
import ifc.eduardo.Estudante;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class teste1 {
    
    
    public static void main(String[] args) {
        Estudante eduardo = new Estudante();
        Estudante gabriel = new Estudante();
        Estudante pedrinho = new Estudante();
        
        eduardo.setNome("Eduardo");
        gabriel.setNome("Gabriel");
        pedrinho.setNome("Pedro");
        
        System.out.println(eduardo.getNome());
        System.out.println(gabriel.getNome());
        System.out.println(pedrinho.getNome());
    }
}
