/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Controle.ConectaBanco;
import Controle.Controle_Aluno;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import Modelos.Modelo_Tabela;
import Modelos.Modelo_Alunos;
import Modelos.Modelo_Treinos;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;
import javax.swing.text.MaskFormatter;

public class Aluno extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();
    Controle_Aluno ctrlAluno = new Controle_Aluno();
    Modelo_Treinos modTreino = new Modelo_Treinos();
    Modelo_Alunos modAluno = new Modelo_Alunos();

    boolean edita = false;
    boolean busca = false;
    boolean empty = false;
    boolean clickTabela = false;
    boolean novo = false;
    boolean campoVazio = false;
    String status;
    
    MaskFormatter MascCPF = null;
    DateTimeFormatter formatoData;
    
    public Aluno() {
        initComponents();
        conecta.conexao();
        setLocationRelativeTo(null);
        iniciacao();
        

    }
    private void iniciacao(){
        desabilitaCampos(txtDtNascimento, txtEmail, txtTelefone);
        LabelID.setVisible(false);
        btnExcluir.setVisible(false);
        preencherTabela("SELECT * FROM alunos ORDER BY id_aluno");
        formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("pt-BR"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BVermelha = new javax.swing.JTextField();
        BNormal = new javax.swing.JTextField();
        BDesabilitado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        avisoEmail = new javax.swing.JLabel();
        avisoCpf = new javax.swing.JLabel();
        avisoFone = new javax.swing.JLabel();
        avisoData = new javax.swing.JLabel();
        avisoNome = new javax.swing.JLabel();
        txtDtNascimento = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        btnSalvaInfoAluno = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnBusca = new javax.swing.JButton();
        campoStatus = new javax.swing.JLabel();
        btnTreinos = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();
        LabelID = new javax.swing.JLabel();
        txtIDAluno = new javax.swing.JLabel();

        BVermelha.setText("jTextField1");
        BVermelha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        BNormal.setText("jTextField1");
        BNormal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        BDesabilitado.setText("jTextField1");
        BDesabilitado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alunos");
        setBackground(new java.awt.Color(102, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setText("Aluno");
        jLabel7.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");
        jPanel1.setName("Aluno"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("E-Mail:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Dt Nascimento:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNome.setDisabledTextColor(new java.awt.Color(204, 204, 255));

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtEmail.setDisabledTextColor(new java.awt.Color(204, 204, 255));
        txtEmail.setEnabled(false);

        avisoEmail.setForeground(new java.awt.Color(204, 0, 0));
        avisoEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        avisoEmail.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        avisoCpf.setForeground(new java.awt.Color(204, 0, 0));
        avisoCpf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        avisoCpf.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        avisoFone.setForeground(new java.awt.Color(204, 0, 0));
        avisoFone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        avisoFone.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        avisoData.setForeground(new java.awt.Color(204, 0, 0));
        avisoData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        avisoData.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        avisoNome.setForeground(new java.awt.Color(204, 0, 0));
        avisoNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        avisoNome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        try {
            txtDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtNascimento.setToolTipText("");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setToolTipText("");

        txtCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setToolTipText("");
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(avisoData, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avisoFone, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefone)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(avisoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avisoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCPF)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(avisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(avisoCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(txtCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(avisoData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(avisoFone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avisoEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        btnSalvaInfoAluno.setText("Salvar");
        btnSalvaInfoAluno.setToolTipText("");
        btnSalvaInfoAluno.setEnabled(false);
        btnSalvaInfoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaInfoAlunoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlunosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAlunos);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnBusca.setText("Buscar");
        btnBusca.setToolTipText("");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        campoStatus.setToolTipText("");

        btnTreinos.setText("Treinos");
        btnTreinos.setEnabled(false);
        btnTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinosActionPerformed(evt);
            }
        });

        aviso.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        aviso.setForeground(new java.awt.Color(204, 0, 0));

        LabelID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelID.setText("ID:");

        txtIDAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIDAluno.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(campoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTreinos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvaInfoAluno))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovo)
                    .addComponent(btnBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvaInfoAluno)
                    .addComponent(campoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTreinos))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnSalvaInfoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaInfoAlunoActionPerformed
        
        btnExcluir.setVisible(false);
        
        String nome = txtNome.getText().trim();
        String cpf = txtCPF.getText().trim();
        String data = txtDtNascimento.getText().trim();
        String fone = txtTelefone.getText().trim();
        String email = txtEmail.getText().trim();

        if (nome.isEmpty()) {
            bordaVermelha(txtNome);
            avisoNome.setText("*");
            campoVazio = true;
        } else {
            bordaNormal(txtNome);
            avisoNome.setText("");
        }
        if (cpf.isEmpty()) {
            bordaVermelha(txtCPF);
            avisoCpf.setText("*");
            campoVazio = true;
        } else {
            bordaNormal(txtCPF);
            avisoCpf.setText("");
        }
        if (data.isEmpty()) {
            bordaVermelha(txtDtNascimento);
            avisoData.setText("*");
            campoVazio = true;
        } else {
            bordaNormal(txtDtNascimento);
            avisoData.setText("");
        }
        if (fone.isEmpty()) {
            bordaVermelha(txtTelefone);
            avisoFone.setText("*");
            campoVazio = true;
        } else {
            bordaNormal(txtTelefone);
            avisoFone.setText("");
        }
        if (email.isEmpty()) {
            bordaVermelha(txtEmail);
            avisoEmail.setText("*");
            campoVazio = true;
        } else {
            bordaNormal(txtEmail);
            avisoEmail.setText("");
        }

        if (campoVazio) {
            aviso.setText("Campos Obrigatórios: *");
            campoVazio = false;
        } else {

            aviso.setText("");
            modAluno.setNome(txtNome.getText());
            modAluno.setCpf(txtCPF.getText());
            LocalDate dataConvertida = LocalDate.parse(txtDtNascimento.getText(), formatoData);
            modAluno.setDt_nascimento(dataConvertida);
            modAluno.setTelefone(txtTelefone.getText());
            modAluno.setEmail(txtEmail.getText());
            conecta.executaSQL("SELECT * FROM alunos WHERE cpf = '" + txtCPF.getText() + "'");
            try {
                if (!conecta.rs.isBeforeFirst()) {
                    campoStatus.setVisible(false);
                    if (novo) {
                        int resposta = JOptionPane.showConfirmDialog(rootPane, "Adicionar treino?", "", JOptionPane.YES_NO_OPTION);

                        if (resposta == JOptionPane.YES_OPTION) {
                            ctrlAluno.InserirAlunoTreino(modAluno);
                            conecta.executaSQL("SELECT * FROM alunos WHERE cpf = '" + txtCPF.getText() + "'");

                            try {
                                conecta.rs.first();
                                modTreino.setId_aluno(conecta.rs.getInt("id_aluno"));

                            } catch (SQLException ex) {
                            }
                            txtIDAluno.setText(String.valueOf(modTreino.getId_aluno()));
                            modTreino.setNome(txtNome.getText());
                            Treino fmr = new Treino();
                            fmr.exportaInfoAluno(modTreino);
                            fmr.setVisible(true);
                            fmr.preenche(String.valueOf(modTreino.getId_aluno()));

                        } else {
                            ctrlAluno.InserirAluno(modAluno);
                        }

                    }

                    if (edita) {
                        modAluno.setId_aluno(Integer.parseInt(txtIDAluno.getText()));
                        ctrlAluno.EditarAluno(modAluno);
                    }

                    bordaNormal(txtNome, txtCPF, txtDtNascimento, txtTelefone, txtEmail);
                    limpaCampos(txtDtNascimento, txtNome, txtCPF, txtEmail, txtTelefone,txtIDAluno);
                    desabilitaCampos(txtDtNascimento, txtEmail, txtTelefone,btnSalvaInfoAluno,btnEditar,btnTreinos,campoStatus);
                    habilitaCampos(btnNovo,btnBusca);

                    LabelID.setVisible(false);
                    novo = false;

                    preencherTabela("SELECT * FROM alunos ORDER BY id_aluno");
                } else {
                    campoStatus.setForeground(Color.RED);
                    campoStatus.setText("CPF já cadastrado!");
                    campoStatus.setVisible(true);
                }

            } catch (SQLException ex) {

            }
            campoVazio = false;
        }
    }//GEN-LAST:event_btnSalvaInfoAlunoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        Object[] opcoes = {"SIM", "NÃO"};
        int confirma = JOptionPane.showOptionDialog(rootPane, "Tem certeza que deseja excluir o aluno?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (confirma == JOptionPane.YES_OPTION) {
            modAluno.setId_aluno(Integer.parseInt(txtIDAluno.getText()));
            ctrlAluno.ExcluirAluno(Integer.parseInt(txtIDAluno.getText()));

            limpaCampos(txtDtNascimento, txtNome, txtCPF, txtEmail, txtTelefone,campoStatus,txtIDAluno);
            desabilitaCampos(txtDtNascimento, txtEmail, txtTelefone,btnSalvaInfoAluno,btnEditar,btnTreinos);
            habilitaCampos(btnNovo,btnBusca);

            LabelID.setVisible(false);
          

            preencherTabela("SELECT * FROM alunos ORDER BY id_aluno");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        campoStatus.setText("");
        if (busca) {
            limpaCampos(txtDtNascimento, txtNome, txtCPF, txtEmail, txtTelefone);
            busca = false;
    }//GEN-LAST:event_btnNovoActionPerformed
        else if (clickTabela) {
            limpaCampos(txtDtNascimento, txtNome, txtCPF, txtEmail, txtTelefone);
            clickTabela = false;
        }
       
        LabelID.setVisible(false);
        btnExcluir.setVisible(false);
        txtIDAluno.setText("");
        
        desabilitaCampos(btnNovo,btnEditar,btnTreinos,tblAlunos);
        habilitaCampos(txtDtNascimento, txtEmail, txtTelefone,btnSalvaInfoAluno);
        bordaNormal(txtDtNascimento, txtEmail, txtTelefone, txtCPF, txtNome);

        preencherTabela("SELECT * FROM alunos ORDER BY id_aluno");
        
        btnExcluir.setVisible(false);
        novo = true;

    }
    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        
        habilitaCampos(tblAlunos,btnNovo);
        desabilitaCampos(btnSalvaInfoAluno,btnTreinos,btnExcluir,btnEditar);
        limpaCampos(aviso,avisoNome,avisoCpf,avisoFone,avisoEmail,txtIDAluno,avisoData);
        
        LabelID.setVisible(false);
        btnExcluir.setVisible(false);

        campoStatus.setForeground(Color.BLACK);

        if (clickTabela || novo) {

            bordaNormal(txtDtNascimento, txtNome, txtCPF, txtEmail, txtTelefone);
            limpaCampos(txtDtNascimento, txtNome, txtCPF, txtEmail, txtTelefone);
            desabilitaCampos(txtDtNascimento, txtEmail, txtTelefone);
            btnTreinos.setEnabled(false);
        }
        if (!"".equals(txtNome.getText())) {
            preencherTabela("SELECT * FROM alunos WHERE nome LIKE '" + txtNome.getText() + "%'");
            status = "Buscando por Nome.";
        } else if (!"".equals(txtCPF.getText())) {
            preencherTabela("SELECT * FROM alunos WHERE cpf LIKE '%" + txtCPF.getText() + "%'");
            status = "Buscando por CPF.";
        } else {
            campoStatus.setForeground(new Color(0, 153, 0));
            status = "Preencha NOME ou CPF para Buscar.";
            preencherTabela("SELECT * FROM alunos ORDER BY id_aluno");
        }

        if (empty) {
            status = "Aluno não localizado.";
            campoStatus.setForeground(Color.RED);
            preencherTabela("SELECT * FROM alunos ORDER BY id_aluno");
            empty = false;
        }
        campoStatus.setText(status);
        
        clickTabela = false;
        novo = false;


    }//GEN-LAST:event_btnBuscaActionPerformed

    private void tblAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlunosMouseClicked

        if (novo) {

        } else {
            int linha = tblAlunos.getSelectedRow();
            txtIDAluno.setText(tblAlunos.getValueAt(linha, 0).toString());
            txtNome.setText(tblAlunos.getValueAt(linha, 1).toString());
            txtCPF.setText(tblAlunos.getValueAt(linha, 2).toString());
            txtTelefone.setText(tblAlunos.getValueAt(linha, 3).toString());
            txtEmail.setText(tblAlunos.getValueAt(linha, 4).toString());
            conecta.executaSQL("SELECT * FROM alunos WHERE id_aluno = '" + txtIDAluno.getText() + "'");

            try {
                if(conecta.rs.next()){
                    Date dataSql = conecta.rs.getDate("dt_nascimento");
                    
                    if(dataSql != null){
                        LocalDate data = dataSql.toLocalDate();
                        String dataFormatada = data.format(formatoData);
                        txtDtNascimento.setText(dataFormatada);
                    }else{
                        txtDtNascimento.setText("");
                    }
                }
 
            } catch (SQLException ex) {
             
            }
        }
        
        habilitaCampos(btnEditar,btnTreinos);
        desabilitaCampos(btnSalvaInfoAluno);
        
        btnExcluir.setVisible(false);
        LabelID.setVisible(true);
        clickTabela = true;

    }//GEN-LAST:event_tblAlunosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        edita = true;
        btnExcluir.setVisible(true);
        habilitaCampos(txtDtNascimento, txtEmail, txtTelefone,btnSalvaInfoAluno);
        desabilitaCampos(btnEditar);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinosActionPerformed

        modTreino.setId_aluno(Integer.parseInt(txtIDAluno.getText()));
        modTreino.setNome(txtNome.getText());
        Treino fmr = new Treino();
        fmr.exportaInfoAluno(modTreino);
        fmr.setVisible(true);
        fmr.preenche(txtIDAluno.getText());

    }//GEN-LAST:event_btnTreinosActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        if(txtCPF.getText().trim().isEmpty()){
            txtCPF.setFormatterFactory(null);
        }else{
            txtCPF = new JFormattedTextField(MascCPF);
        }
    }//GEN-LAST:event_txtCPFActionPerformed

 
    
    private void habilitaCampos(JComponent... campos) {
        Border enabled = BNormal.getBorder();
        for (JComponent campo : campos) {
            if(campo instanceof JTextComponent){
               campo.setBorder(enabled);
                campo.setEnabled(true);
                campo.setBackground(new Color(255, 255, 255));
            }
            if(campo instanceof JButton){
                campo.setEnabled(true);
            }
            if(campo instanceof JPanel){
                campo.setEnabled(true);
            }
        }
    }

    private void desabilitaCampos(JComponent... campos) {
        Border disabled = BDesabilitado.getBorder();
        for (JComponent campo : campos) {
            if(campo instanceof JTextComponent){
               campo.setBorder(disabled);
                campo.setEnabled(false);
                campo.setBackground(new Color(240, 240, 240));
                
            }
            if(campo instanceof JButton){
                campo.setEnabled(false);
            }
            if(campo instanceof JPanel){
                campo.setEnabled(false);
            }
        }
    }

    private void limpaCampos(JComponent... campos) {
        for (JComponent campo : campos) {

            if (campo instanceof JTextComponent jTextComponent) {
                jTextComponent.setText("");
            }

            if (campo instanceof JLabel jLabel) {
                jLabel.setText("");
            }

        }
    }

    private void bordaVermelha(JTextComponent... campos) {
        Border vermelha = BVermelha.getBorder();
        for (JTextComponent campo : campos) {
            campo.setBorder(vermelha);
        }
    }

    private void bordaNormal(JTextComponent... campos) {
        Border normal = BNormal.getBorder();
        for (JTextComponent campo : campos) {
            campo.setBorder(normal);
        }
    }
    
    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();

        String[] colunas = new String[]{"ID", "NOME", "CPF", "TELEFONE", "EMAIL"};

        conecta.executaSQL(sql);
        try {
            if (conecta.rs.isBeforeFirst()) {
                conecta.rs.first();
                do {
                    dados.add(new Object[]{conecta.rs.getInt("id_aluno"), conecta.rs.getString("nome"), conecta.rs.getString("cpf"), conecta.rs.getString("telefone"), conecta.rs.getString("email")});
                } while (conecta.rs.next());
            } else {
                empty = true;
            }

        } catch (SQLException ex) {

        }
        Modelo_Tabela modelo = new Modelo_Tabela(dados, colunas);
        tblAlunos.setModel(modelo);
        tblAlunos.getColumnModel().getColumn(0).setPreferredWidth(35);
        tblAlunos.getColumnModel().getColumn(0).setResizable(false);
        tblAlunos.getColumnModel().getColumn(1).setPreferredWidth(115);
        tblAlunos.getColumnModel().getColumn(1).setResizable(false);
        tblAlunos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblAlunos.getColumnModel().getColumn(2).setResizable(false);
        tblAlunos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblAlunos.getColumnModel().getColumn(3).setResizable(false);
        tblAlunos.getColumnModel().getColumn(4).setPreferredWidth(189);
        tblAlunos.getColumnModel().getColumn(4).setResizable(false);
        tblAlunos.getTableHeader().setReorderingAllowed(false);
        tblAlunos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblAlunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Aluno().setVisible(true);

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BDesabilitado;
    private javax.swing.JTextField BNormal;
    private javax.swing.JTextField BVermelha;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel avisoCpf;
    private javax.swing.JLabel avisoData;
    private javax.swing.JLabel avisoEmail;
    private javax.swing.JLabel avisoFone;
    private javax.swing.JLabel avisoNome;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvaInfoAluno;
    private javax.swing.JButton btnTreinos;
    private javax.swing.JLabel campoStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtDtNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtIDAluno;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
