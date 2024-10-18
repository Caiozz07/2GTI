/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package notasponderadas_2gti;

import java.awt.Color;

/**
 *
 * @author Professor
 */
public class GUI_NotasPonderadas extends javax.swing.JFrame {

    /**
     * Creates new form GUI_NotasPonderadas
     */
    public GUI_NotasPonderadas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cb_Nota1 = new javax.swing.JCheckBox();
        cb_Nota2 = new javax.swing.JCheckBox();
        cb_Nota3 = new javax.swing.JCheckBox();
        cb_Nota4 = new javax.swing.JCheckBox();
        cb_Nota5 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtf_Nota1 = new javax.swing.JTextField();
        jtf_Nota2 = new javax.swing.JTextField();
        jtf_Nota3 = new javax.swing.JTextField();
        jtf_Nota4 = new javax.swing.JTextField();
        jtf_Nota5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtf_Peso1 = new javax.swing.JTextField();
        jtf_Peso2 = new javax.swing.JTextField();
        jtf_Peso3 = new javax.swing.JTextField();
        jtf_Peso4 = new javax.swing.JTextField();
        jtf_Peso5 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtf_Media = new javax.swing.JTextField();
        jtf_SomaPesos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jb_VerificarPesos = new javax.swing.JButton();
        jb_Calcular = new javax.swing.JButton();
        jb_Limpar = new javax.swing.JButton();
        jcb_MediaComPesos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Sistema de Notas Ponderadas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Caio bandeira de França");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("RA: 17.127");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Habilitado");

        cb_Nota1.setSelected(true);
        cb_Nota1.setText("Nota 1");
        cb_Nota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_Nota1ActionPerformed(evt);
            }
        });

        cb_Nota2.setSelected(true);
        cb_Nota2.setText("Nota 2");
        cb_Nota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_Nota2ActionPerformed(evt);
            }
        });

        cb_Nota3.setText("Nota 3");
        cb_Nota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_Nota3ActionPerformed(evt);
            }
        });

        cb_Nota4.setText("Nota 4");
        cb_Nota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_Nota4ActionPerformed(evt);
            }
        });

        cb_Nota5.setText("Nota 5");
        cb_Nota5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_Nota5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cb_Nota5)
                        .addComponent(cb_Nota4)
                        .addComponent(cb_Nota3)
                        .addComponent(cb_Nota2)
                        .addComponent(cb_Nota1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(cb_Nota1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_Nota2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_Nota3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_Nota4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_Nota5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Notas");

        jtf_Nota1.setText("0");

        jtf_Nota2.setText("0");

        jtf_Nota3.setText("0");
        jtf_Nota3.setEnabled(false);

        jtf_Nota4.setText("0");
        jtf_Nota4.setEnabled(false);

        jtf_Nota5.setText("0");
        jtf_Nota5.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_Nota1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jtf_Nota2)
                    .addComponent(jtf_Nota3)
                    .addComponent(jtf_Nota4)
                    .addComponent(jtf_Nota5))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_Nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jtf_Nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_Nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jtf_Nota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_Nota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Pesos");

        jtf_Peso1.setText("0");

        jtf_Peso2.setText("0");

        jtf_Peso3.setText("0");
        jtf_Peso3.setEnabled(false);

        jtf_Peso4.setText("0");
        jtf_Peso4.setEnabled(false);

        jtf_Peso5.setText("0");
        jtf_Peso5.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_Peso5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_Peso4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_Peso3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_Peso2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_Peso1))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_Peso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_Peso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_Peso4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_Peso5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Resultado =");

        jtf_Media.setFocusable(false);
        jtf_Media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_MediaActionPerformed(evt);
            }
        });

        jtf_SomaPesos.setFocusable(false);
        jtf_SomaPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_SomaPesosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Média");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Soma Pesos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(jtf_Media, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_SomaPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(169, 169, 169))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_SomaPesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jb_VerificarPesos.setText("VERIFICAR PESOS");
        jb_VerificarPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_VerificarPesosActionPerformed(evt);
            }
        });

        jb_Calcular.setText("CALCULAR");
        jb_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CalcularActionPerformed(evt);
            }
        });

        jb_Limpar.setText("LIMPAR");
        jb_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_LimparActionPerformed(evt);
            }
        });

        jcb_MediaComPesos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jcb_MediaComPesos.setSelected(true);
        jcb_MediaComPesos.setText("Média com Pesos ");
        jcb_MediaComPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_MediaComPesosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_VerificarPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jcb_MediaComPesos)
                        .addGap(38, 38, 38))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jcb_MediaComPesos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_VerificarPesos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_Calcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_Limpar)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_VerificarPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_VerificarPesosActionPerformed
        // TODO add your handling code here:
        double soma10;
         cnp.setPeso1(Double.parseDouble(jtf_Peso1.getText()));
         cnp.setPeso2(Double.parseDouble(jtf_Peso2.getText()));
         cnp.setPeso3(Double.parseDouble(jtf_Peso3.getText()));
         cnp.setPeso4(Double.parseDouble(jtf_Peso4.getText()));
         cnp.setPeso5(Double.parseDouble(jtf_Peso5.getText()));
    
        soma10 = cnp.getPeso1() + cnp.getPeso2()+ cnp.getPeso3() + cnp.getPeso4()+ cnp.getPeso5();
        jtf_SomaPesos.setText(String.valueOf(soma10));
        if (soma10 != 10){
             jtf_SomaPesos.setBackground(Color.red);
                     
        }
    }//GEN-LAST:event_jb_VerificarPesosActionPerformed

    private void jb_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CalcularActionPerformed
        
        cnp.setNota1(Double.parseDouble(jtf_Nota1.getText()));
        cnp.setNota2(Double.parseDouble(jtf_Nota2.getText()));
        cnp.setNota3(Double.parseDouble(jtf_Nota2.getText()));
        cnp.setNota4(Double.parseDouble(jtf_Nota2.getText()));
        cnp.setNota5(Double.parseDouble(jtf_Nota2.getText()));
        
// verificar se o calcular é ponderado
if (cnp.isNotasPonderadas() == true){
    cnp.setPeso1(Double.parseDouble(jtf_Nota1.getText()));
    cnp.setPeso2(Double.parseDouble(jtf_Nota2.getText()));
    cnp.setPeso3(Double.parseDouble(jtf_Nota2.getText()));
    cnp.setPeso4(Double.parseDouble(jtf_Nota2.getText()));
    cnp.setPeso5(Double.parseDouble(jtf_Nota2.getText()));
}
        
        cnp.CalcularMedia();
        jtf_Media.setText(String.valueOf(cnp.getMedia()));
    }//GEN-LAST:event_jb_CalcularActionPerformed

    private void jcb_MediaComPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_MediaComPesosActionPerformed
        if (jcb_MediaComPesos.isSelected() == true){
            cnp.setNotasPonderadas(true);
            jcb_MediaComPesos.setSelected(true); 
         } else {
            cnp.setNotasPonderadas(false);
            jcb_MediaComPesos.setSelected(false);
        }
    }//GEN-LAST:event_jcb_MediaComPesosActionPerformed

    private void jb_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_LimparActionPerformed
       //calcular
       cnp.setCbNota2(rootPaneCheckingEnabled);
       
       //limpar
       jtf_Nota1.setText("0");
       jtf_Nota2.setText("0");
       jtf_Nota3.setText("0");
       jtf_Nota4.setText("0");
       jtf_Nota5.setText("0");
       jtf_Peso1.setText("0");
       jtf_Peso2.setText("0");
       jtf_Peso3.setText("0");
       jtf_Peso4.setText("0");
       jtf_Peso5.setText("0");
       jtf_Media.setText("");
       jtf_SomaPesos.setText("");
       cb_Nota1.setSelected(false);
       cb_Nota2.setSelected(false);
       cb_Nota3.setSelected(false);
       cb_Nota4.setSelected(false);
       cb_Nota5.setSelected(false);
       jcb_MediaComPesos.setSelected(false);
    }//GEN-LAST:event_jb_LimparActionPerformed

    private void jtf_SomaPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_SomaPesosActionPerformed
        //Somar todos os pesos 
        
        
    }//GEN-LAST:event_jtf_SomaPesosActionPerformed

    private void jtf_MediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_MediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_MediaActionPerformed

    private void cb_Nota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_Nota3ActionPerformed
      if (cb_Nota3.isSelected()){
      jtf_Nota3.setEnabled(true);
      jtf_Peso3.setEnabled(true);
      } else {
      if (cb_Nota4.isSelected() == false) {
      
      jtf_Nota3.setEnabled(false);
      jtf_Peso3.setEnabled(false);
      }  
      }
    
    }//GEN-LAST:event_cb_Nota3ActionPerformed

    private void cb_Nota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_Nota4ActionPerformed
        if (cb_Nota3.isSelected()){
      if(cb_Nota4.isSelected())
              jtf_Nota4.setEnabled(true);
              jtf_Peso4.setEnabled(true);
      } else {
      if (cb_Nota5.isSelected() == false) {
      jtf_Nota4.setEnabled(false);
      jtf_Peso4.setEnabled(false);
          
      }}
    
       
    }//GEN-LAST:event_cb_Nota4ActionPerformed

    private void cb_Nota5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_Nota5ActionPerformed
         if (cb_Nota4.isSelected()){
      if(cb_Nota5.isSelected())
              jtf_Nota5.setEnabled(true);
              jtf_Peso5.setEnabled(true);
      } else {
      jtf_Nota5.setEnabled(false);
      jtf_Peso5.setEnabled(false);
          
      }
    
       
    }//GEN-LAST:event_cb_Nota5ActionPerformed

    private void cb_Nota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_Nota1ActionPerformed
  
    }//GEN-LAST:event_cb_Nota1ActionPerformed

    private void cb_Nota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_Nota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_Nota2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_NotasPonderadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_NotasPonderadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_NotasPonderadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_NotasPonderadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_NotasPonderadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb_Nota1;
    private javax.swing.JCheckBox cb_Nota2;
    private javax.swing.JCheckBox cb_Nota3;
    private javax.swing.JCheckBox cb_Nota4;
    private javax.swing.JCheckBox cb_Nota5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jb_Calcular;
    private javax.swing.JButton jb_Limpar;
    private javax.swing.JButton jb_VerificarPesos;
    private javax.swing.JCheckBox jcb_MediaComPesos;
    private javax.swing.JTextField jtf_Media;
    private javax.swing.JTextField jtf_Nota1;
    private javax.swing.JTextField jtf_Nota2;
    private javax.swing.JTextField jtf_Nota3;
    private javax.swing.JTextField jtf_Nota4;
    private javax.swing.JTextField jtf_Nota5;
    private javax.swing.JTextField jtf_Peso1;
    private javax.swing.JTextField jtf_Peso2;
    private javax.swing.JTextField jtf_Peso3;
    private javax.swing.JTextField jtf_Peso4;
    private javax.swing.JTextField jtf_Peso5;
    private javax.swing.JTextField jtf_SomaPesos;
    // End of variables declaration//GEN-END:variables
    CalcularNotasPonderadas cnp = new CalcularNotasPonderadas();
}
