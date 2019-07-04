
package cadfuncionario;

import Modelo.Funcionario;
import cargo.AumentoSalarial;
import javax.swing.JOptionPane;
public class InterfaceCalSalario extends javax.swing.JFrame {
    public InterfaceCalSalario() {
        initComponents();
        //para o texto (resultado ------), não aparecer na interfaçe gráfica.
        labelResultadoNome.setText("");
        labelResultadoSobrenome.setText("");
        labelResultadoNovosalario.setText("");
        labelResultadoDiferença.setText("");
        labelResultadoCargo.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        labelSalario = new javax.swing.JLabel();
        cpSalario = new javax.swing.JTextField();
        labelCodigoCargo = new javax.swing.JLabel();
        cpCodigo = new javax.swing.JTextField();
        labelTempoServico = new javax.swing.JLabel();
        cpTempoServico = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        labelNovoSalario = new javax.swing.JLabel();
        labelResultadoNovosalario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelDiferenca = new javax.swing.JLabel();
        labelResultadoDiferença = new javax.swing.JLabel();
        labelSobrenome = new javax.swing.JLabel();
        cpSobrenome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelResultadoCargo = new javax.swing.JLabel();
        labelResultadoSobrenome = new javax.swing.JLabel();
        labelResultadoNome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculo de Aumento Salarial");
        setBackground(new java.awt.Color(102, 102, 102));

        labelNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelNome.setText("Nome:");
        labelNome.setName(""); // NOI18N

        cpNome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        labelSalario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelSalario.setText("Informe o Salário:");

        cpSalario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        labelCodigoCargo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelCodigoCargo.setText("Informe o Código da Cargo:");

        cpCodigo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        labelTempoServico.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelTempoServico.setText("Informe o Tempo de Serviço:");

        cpTempoServico.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        btnCalcular.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 0, 0));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        labelNovoSalario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelNovoSalario.setText("Novo Salário: ");

        labelResultadoNovosalario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelResultadoNovosalario.setText("(resultado salário)");

        labelDiferenca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelDiferenca.setText("Diferença: ");

        labelResultadoDiferença.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelResultadoDiferença.setText("(resultado diferença)");

        labelSobrenome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelSobrenome.setText("Sobrenome:");

        cpSobrenome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Sobrenome:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Cargo:");

        labelResultadoCargo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelResultadoCargo.setText("(resultado cargo)");

        labelResultadoSobrenome.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelResultadoSobrenome.setText("(resultado sobrenome)");

        labelResultadoNome.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelResultadoNome.setText("(resultado nome)");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSobrenome)
                    .addComponent(labelSalario)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNovoSalario)
                            .addComponent(labelDiferenca)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelResultadoNome)
                            .addComponent(labelResultadoSobrenome)
                            .addComponent(labelResultadoCargo)
                            .addComponent(labelResultadoDiferença)
                            .addComponent(labelResultadoNovosalario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome)
                    .addComponent(cpSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigoCargo)
                    .addComponent(labelTempoServico)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cpTempoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(labelSobrenome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCodigoCargo)
                .addGap(4, 4, 4)
                .addComponent(cpCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(labelTempoServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpTempoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labelResultadoNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelResultadoSobrenome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelResultadoCargo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNovoSalario)
                            .addComponent(labelResultadoNovosalario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelResultadoDiferença)
                            .addComponent(labelDiferenca)))))
        );

        cpNome.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        String nome = cpNome.getText();
        String sobrenome = cpSobrenome.getText();
        //converte variavel de string para para double
        double salario = Double.parseDouble(cpSalario.getText());
        int codCargo = Integer.parseInt(cpCodigo.getText());
        int tempoServiço = Integer.parseInt(cpTempoServico.getText());
        Funcionario f = new Funcionario();
        //para acessar os atributos do funcionário private
        f.setNome(nome);
        f.setSalario(salario);
        f.setCodCargo(codCargo);
        f.settempserviço(tempoServiço);
        
        //Declarar aqui todo o que for calculado na classe aumento salário 
        AumentoSalarial s = new AumentoSalarial(f);
        
        labelResultadoNome.setText(""+nome);
        labelResultadoSobrenome.setText(""+sobrenome);
        labelResultadoCargo.setText(""+f.getCargo());
        double novoSalario = s.calcularAumento();
        labelResultadoNovosalario.setText(""+novoSalario);
        labelResultadoDiferença.setText(""+(novoSalario - f.getSalario()));
    }//GEN-LAST:event_btnCalcularActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalSalario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField cpCodigo;
    private javax.swing.JTextField cpNome;
    private javax.swing.JTextField cpSalario;
    private javax.swing.JTextField cpSobrenome;
    private javax.swing.JTextField cpTempoServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCodigoCargo;
    private javax.swing.JLabel labelDiferenca;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNovoSalario;
    private javax.swing.JLabel labelResultadoCargo;
    private javax.swing.JLabel labelResultadoDiferença;
    private javax.swing.JLabel labelResultadoNome;
    private javax.swing.JLabel labelResultadoNovosalario;
    private javax.swing.JLabel labelResultadoSobrenome;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JLabel labelSobrenome;
    private javax.swing.JLabel labelTempoServico;
    // End of variables declaration//GEN-END:variables
}
