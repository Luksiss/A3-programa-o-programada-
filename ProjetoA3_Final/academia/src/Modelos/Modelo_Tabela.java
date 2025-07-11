/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class Modelo_Tabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public Modelo_Tabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
    }
    public ArrayList getLinhas(){
        return linhas;
    }
    
    public void setLinhas(ArrayList dados){
        linhas = dados;
    }
    
    public String[] getColunas(){
        return colunas;
    }
    
    public void setColunas(String[] nomes){
        colunas = nomes;
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    
    @Override
    public int getRowCount(){
        return linhas.size();
    }
    @Override
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    
    @Override
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
}
