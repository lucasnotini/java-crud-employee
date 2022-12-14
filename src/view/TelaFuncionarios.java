
package view;

import data.Funcionario;
import data.FuncionarioDao;
import javax.swing.JOptionPane;

public class TelaFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaFuncionarios
     */
    public TelaFuncionarios() {
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

        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão de Funcionários");
        setBackground(new java.awt.Color(204, 255, 255));

        lblMatricula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMatricula.setText("Matrícula");

        txtMatricula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setText("Nome");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCargo.setText("Cargo");

        txtCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });

        lblSalario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSalario.setText("Salário");

        txtSalario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        setSize(new java.awt.Dimension(502, 351));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
          
     //Instancio Objeto da Classe Funcionario
     Funcionario funcionario = new Funcionario();
     FuncionarioDao dao;
     boolean status;
     int resposta;
     
     //salvo/encapsulo o que está no campo do formulário no atributo da classe
     //usando o método Setter de cada atributo
     funcionario.setMatricula(txtMatricula.getText());
     funcionario.setNome(txtNome.getText());
     funcionario.setCargo(txtCargo.getText());
     funcionario.setSalario(Double.parseDouble(txtSalario.getText()));
     
     dao = new FuncionarioDao();
     
     //chamo método conectar
     status = dao.conectar();
     
        if (status==false) {
            JOptionPane.showMessageDialog(null, "Conexão com o banco de dados falhou");
        }
        else {
            //chamo método salvar do objeto dao e passo o objeto "funcionario" que usei para encapsular informações pegas do formulário
            resposta = dao.salvar(funcionario);
         switch (resposta) {
             case 1:
                 JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso no banco de dados");
                 limparCampos();
                 break;
             case 1062:
                 JOptionPane.showMessageDialog(null, "Esta matrícula já foi cadastrada");
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Erro ao tentar salvar o funcionário");
                 break;
         }
            dao.desconectar();
        }
        
//System.out.println(funcionario.getMatricula());

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    
    String matricula;
    
    matricula = txtMatricula.getText();
    
    //instancio/crio objeto da classe FuncionarioDao para eu poder usar os metodos conectar e consultar dela
    FuncionarioDao dao = new FuncionarioDao();
    
    boolean status = dao.conectar(); //chamo método conectar, que devolve True se conectou e False se não
        
        if (status == true) {
            
            //Crio objeto da classe Funcionario para receber dados que vieram da tabela
            Funcionario funcionario = dao.consultar(matricula); // chamo método consultar já que sei que está conectado, passo var matrícula que tem conteudo do campo e que vai entrar lá no parametro do método
            //System.out.println("dao.consultar(matricula): " + dao.consultar(matricula));  
            
            if (funcionario == null){
                JOptionPane.showMessageDialog(null, "Funcionário não localizado");
                //System.out.println("matricuka:  " + matricula);
            }
            
            else{
                txtNome.setText(funcionario.getNome());
                txtCargo.setText(funcionario.getCargo());
                txtSalario.setText(String.valueOf(funcionario.getSalario())); //uso Classe String e método .valueOf() para passar double para String. Formulário só aceita Strings
                btnExcluir.setEnabled(true); // ao ter encontrado funcionário, torno botão excluir enabled com o método setEnabled()
                btnAlterar.setEnabled(true); // ao ter encontrado funcionário, torno botão alterar enabled 
            }
            
            dao.desconectar(); //se havia conectado e já fez tudo, uso método para desconectar do banco
        }
        
        else{
        JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados");
    }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        String matricula; //crio variável String para receber a matrícula que está no campo do formulário
        matricula = txtMatricula.getText();
        
        FuncionarioDao dao = new FuncionarioDao(); //para usar os métodos da classe FuncionarioDao preciso criar objeto dela
        
        boolean status = dao.conectar(); // chamo método conectar para conectar ao banco (a cada botão ele desconecta)
        
        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados");
        }
        
        else{
           status = dao.excluir(matricula); //executo método excluir passando variável com a matrícula e salvo retorno na variável status (se excluiu retorna true)
            
           if (status == true) { //se deu certo ao executar método excluir
                JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso");
                limparCampos(); //se excluiu, limpo campos com meu método limparCampos()
                btnExcluir.setEnabled(false); //após excluir, desabilito novamente botão até que nova consulta seja feita
                }
            
            else{ //se deu erro ao executar método excluir
               JOptionPane.showMessageDialog(null, "Erro na exclusão do funcionário");
            }
            
            dao.desconectar(); // se status era true, ou seja, conectou e então desconecto
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       
          //Instancio Objeto da Classe Funcionario
     Funcionario funcionario = new Funcionario();
     FuncionarioDao dao = new FuncionarioDao();
     boolean status;
  
     
     //encapsulo o que está no campo do formulário no meu objeto Funcionario
     funcionario.setMatricula(txtMatricula.getText());
     funcionario.setNome(txtNome.getText());
     funcionario.setCargo(txtCargo.getText());
     funcionario.setSalario(Double.parseDouble(txtSalario.getText()));
     
//            System.out.println("funcionario.getMatricula = " + funcionario.getMatricula());
//            System.out.println("funcionario.getNome = " + funcionario.getNome());
//            System.out.println("funcionario.getCargo = " + funcionario.getCargo());
//            System.out.println("funcionario.getSalario = " + funcionario.getSalario());
          
     status = dao.conectar();
     
        if (status == false) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar com o Banco de Dados");
        }
        
        else{
            
            status = dao.alterar(funcionario);
            
            if (status == true) {
                JOptionPane.showMessageDialog(null,"Funcionário alterado com sucesso");
                btnAlterar.setEnabled(false); //após excluir, desabilito novamente botão até que nova consulta seja feita
            }
            else{
                JOptionPane.showMessageDialog(null,"Falha ao alterar funcionário");
            }
        }
         
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        limparCampos();
        
    }//GEN-LAST:event_btnLimparActionPerformed
  
    public void limparCampos(){
        //limpo campos e coloco cursor de volta no primeiro
        txtMatricula.setText("");
        txtNome.setText("");
        txtCargo.setText("");
        txtSalario.setText("");
        txtMatricula.requestFocus();
        }
    
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
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
