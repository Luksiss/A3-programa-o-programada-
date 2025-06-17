package Modelos;

import java.time.LocalDate;


public class Modelo_Treinos {
    private int id_treino;
    private String tipo;
    private String descricao;
    private int duracao;
    private LocalDate data_inicio;
    private int fk_id_aluno;
    
    
    //EXPORTA PARAMETRO
    private String nome;

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the dtInicio
     */
    public LocalDate getDtInicio() {
        return data_inicio;
    }

    /**
     * @param dtInicio the dtInicio to set
     */
    public void setDtInicio(LocalDate dtInicio) {
        this.data_inicio = dtInicio;
    }

    /**
     * @return the id_aluno
     */
    public int getId_aluno() {
        return fk_id_aluno;
        
    }

    /**
     * @param id_aluno the id_aluno to set
     */
    public void setId_aluno(int id_aluno) {
        this.fk_id_aluno = id_aluno;
    }

    /**
     * @return the id_treino
     */
    public int getId_treino() {
        return id_treino;
    }

    public void setId_treino(int id_treino) {
        this.id_treino = id_treino;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
     public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
