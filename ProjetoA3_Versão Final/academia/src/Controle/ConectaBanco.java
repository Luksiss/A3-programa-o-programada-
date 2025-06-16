
package Controle;

import java.sql.*;

import javax.swing.JOptionPane;

public class ConectaBanco {
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/BancoA3";
    private String usuario = "postgres";
    private String senha = "576542";
    public Connection conn;
    
    private static boolean primeiraConexao = false;

    

    public void conexao(){   
        try {
            System.setProperty("jdbc.Driver", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            
            if(!primeiraConexao){
                JOptionPane.showMessageDialog(null, "Conectado com sucesso!", "Conexão",JOptionPane.INFORMATION_MESSAGE);
                primeiraConexao = true;
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!\nErro: "+ex.getMessage());
        }
    }
    
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            
            
        } catch (SQLException ex) {
            
            //JOptionPane.showMessageDialog(null, "Erro no ExecutaSQL!\nErro: "+ex.getMessage());
        }
    }
    public void desconecta(){
        try {
            conn.close();
           JOptionPane.showMessageDialog(null, "Desconectado com sucesso!", "Conexão",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao fechar conexão!\nErro: "+ex.getMessage());
        }
    }
    
}
