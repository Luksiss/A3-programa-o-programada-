/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelos.Modelo_Alunos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jean Santiago
 */
public class Controle_Aluno {
    ConectaBanco connAluno = new ConectaBanco();
    
    public void InserirAluno(Modelo_Alunos aluno){
        connAluno.conexao();
        try {
            PreparedStatement pstAluno = connAluno.conn.prepareStatement("INSERT INTO alunos (nome,cpf,dt_nascimento,telefone,email) VALUES (?,?,?,?,?)");
            pstAluno.setString(1,aluno.getNome());
            pstAluno.setString(2,aluno.getCpf());
            pstAluno.setDate(3,java.sql.Date.valueOf(aluno.getDt_nascimento()));
            pstAluno.setString(4,aluno.getTelefone());
            pstAluno.setString(5,aluno.getEmail());
            pstAluno.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o aluno!\nERRO:"+ex);
        }
        
    }
    public void InserirAlunoTreino(Modelo_Alunos aluno){
        connAluno.conexao();
        try {
            PreparedStatement pstAluno = connAluno.conn.prepareStatement("INSERT INTO alunos (nome,cpf,dt_nascimento,telefone,email) VALUES (?,?,?,?,?)");
            pstAluno.setString(1,aluno.getNome());
            pstAluno.setString(2,aluno.getCpf());
            pstAluno.setDate(3,java.sql.Date.valueOf(aluno.getDt_nascimento()));
            pstAluno.setString(4,aluno.getTelefone());
            pstAluno.setString(5,aluno.getEmail());
            pstAluno.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o aluno!\nERRO:"+ex);
        }
        
    }
    
    public void ExcluirAluno(int id_aluno){
        connAluno.conexao();
        connAluno.executaSQL("DELETE FROM alunos WHERE id_aluno = " + id_aluno);
        JOptionPane.showMessageDialog(null, "Aluno excluido com sucesso!");
    }
    
    public void EditarAluno(Modelo_Alunos aluno){
        connAluno.conexao();
        
        try {
            PreparedStatement pstAluno = connAluno.conn.prepareStatement("UPDATE alunos SET nome = ?, cpf = ?,dt_nascimento = ?, telefone = ?, email = ? WHERE id_aluno = ?");
            pstAluno.setString(1,aluno.getNome());
            pstAluno.setString(2,aluno.getCpf());
            pstAluno.setDate(3,java.sql.Date.valueOf(aluno.getDt_nascimento()));
            pstAluno.setString(4,aluno.getTelefone());
            pstAluno.setString(5,aluno.getEmail());
            pstAluno.setInt(6, aluno.getId_aluno() );
            pstAluno.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar editar o aluno!\nERRO:"+ex);
        }
    }
}
