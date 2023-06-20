
package schulverwaltungssystem;


import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammed
 */
public class Seite extends javax.swing.JFrame {

    /**
     * Creates new form Seite
     */
    public Seite() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        benutzer = new javax.swing.JTextField();
        passwort = new javax.swing.JTextField();
        al = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schulverwaltungssystem/AddNewBookIcons/AddNewBookIcons/best-school-management-system.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 600, 600));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(51, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 25)); // NOI18N
        jLabel3.setText("Anmeldeseite");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 190, 35));

        jLabel4.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Geheimcode eingeben");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 190, 35));

        jLabel6.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nutzername");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, 35));

        jLabel7.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Passwort");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, 35));

        jLabel8.setFont(new java.awt.Font("Swis721 Cn BT", 3, 18)); // NOI18N
        jLabel8.setText("Passwort vergessen");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 190, 35));

        benutzer.setToolTipText("");
        benutzer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benutzerActionPerformed(evt);
            }
        });
        jPanel1.add(benutzer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, -1));
        jPanel1.add(passwort, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 160, -1));

        al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alActionPerformed(evt);
            }
        });
        jPanel1.add(al, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 140, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Klicken");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 130, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Klicken");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 480, 500));

        jLabel2.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 25)); // NOI18N
        jLabel2.setText("Schulverwaltungssystem");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 360, 35));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schulverwaltungssystem/AddNewBookIcons/AddNewBookIcons/Türk-Alman-Üniversitesi-logo.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 120, 150));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void benutzerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benutzerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_benutzerActionPerformed

    private void alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String un = benutzer.getText();
        String p = passwort.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn;
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            Statement st = (Statement)conn.createStatement();
            String sql = "select* from userlogin";

            ResultSet rs= st.executeQuery(sql);
            while (rs.next()){
                String username = rs.getString("username");
                String Password = rs.getString ("password");

                if(un.equals(username)&& p.equals(Password)){
                    new Hallo().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Username bzw. Password incorrect");
                }// TODO add your handling code here:
            }
    }//GEN-LAST:event_jButton1ActionPerformed
catch(HeadlessException | ClassNotFoundException | SQLException e ){
                    JOptionPane.showMessageDialog(null,"Fehler beim Verbindungsaufbau");
                }
   }
    
  
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
           String secret = al.getText();
        if(secret.equals("Muhammed")){
            JOptionPane.showMessageDialog(this,"Der Benutzername und das Passwort sind „admin“.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Seite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Seite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField al;
    private javax.swing.JTextField benutzer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passwort;
    // End of variables declaration//GEN-END:variables

    boolean istAnmeldungErfolgreich(String admin, String admin0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }}

