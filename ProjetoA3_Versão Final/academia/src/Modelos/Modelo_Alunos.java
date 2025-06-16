package Modelos;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Modelo_Alunos {
    private int id_aluno;
    private String nome;
    private LocalDate dt_nascimento;
    private String telefone;
    private String cpf;
    private String email;


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
 
     
    public LocalDate getDt_nascimento() {
        return dt_nascimento;
    }

   
    public void setDt_nascimento(LocalDate dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

   
    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the id_aluno
     */
    public int getId_aluno() {
        JOptionPane.showMessageDialog(null, "ID entrada" + id_aluno);
        return id_aluno;
        
    }

    /**
     * @param id_aluno the id_aluno to set
     */
    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;

    }

    
}
