/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;


import Modelos.Modelo_Treinos;
import java.sql.*;
import javax.swing.JOptionPane;



/**
 *
 * @author Jean Santiago
 */
public class Controle_Treino {

    ConectaBanco connTreino = new ConectaBanco();

    public void InserirTreino(Modelo_Treinos treino) {
        connTreino.conexao();
        try {
            PreparedStatement pstTreino = connTreino.conn.prepareStatement("INSERT INTO treinos (tipo,duracao,descricao,data_inicio,fk_id_aluno) VALUES (?,?,?,?,?)");
            pstTreino.setString(1, treino.getTipo());
            pstTreino.setInt(2, treino.getDuracao());
            pstTreino.setString(3, treino.getDescricao());
            pstTreino.setDate(4,java.sql.Date.valueOf(treino.getDtInicio()));
            pstTreino.setInt(5, treino.getId_aluno());
            pstTreino.executeUpdate();
            JOptionPane.showMessageDialog(null, "Treino cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o treino!\nERRO:" + ex);
        }

    }

    public void ExcluirTreino(int id_treino) {
        connTreino.conexao();
        connTreino.executaSQL("DELETE FROM treinos WHERE id_treino = " + id_treino);
        JOptionPane.showMessageDialog(null, "treino excluido com sucesso!" + id_treino);
    }

    public void EditarTreino(Modelo_Treinos treino) {
        connTreino.conexao();

        try {
            PreparedStatement pstTreino = connTreino.conn.prepareStatement("UPDATE treinos SET tipo = ?, duracao = ?, data_inicio = ?, Descricao = ? WHERE id_treino = ?");
            pstTreino.setString(1, treino.getTipo());
            pstTreino.setInt(2, treino.getDuracao());
            pstTreino.setDate(3,java.sql.Date.valueOf(treino.getDtInicio()));
            pstTreino.setString(4, treino.getDescricao());
            pstTreino.setInt(5, treino.getId_treino());
            pstTreino.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar editar o aluno!\nERRO:" + ex);
        }
    }



}
