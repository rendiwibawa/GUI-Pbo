/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1;

/**
 *
 * @author rendi
 */
public class Penilaian extends javax.swing.JFrame {

    /**
     * Creates new form Penilaian
     */
    public Penilaian() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        nilai = new javax.swing.JTextField();
        keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TX = new javax.swing.JTextArea();
        mapel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PENILAIAN SISWA TELKOM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(99, 11, 270, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nama         :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 40, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Kelas          :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nilai           :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 200, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Absen        :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 120, 80, 30);
        getContentPane().add(nama);
        nama.setBounds(120, 46, 210, 30);
        getContentPane().add(kelas);
        kelas.setBounds(120, 84, 210, 30);
        getContentPane().add(absen);
        absen.setBounds(120, 122, 210, 30);
        getContentPane().add(nilai);
        nilai.setBounds(120, 200, 210, 30);

        keluar.setBackground(new java.awt.Color(0, 51, 255));
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(250, 470, 80, 40);

        TX.setColumns(20);
        TX.setRows(5);
        jScrollPane1.setViewportView(TX);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 290, 320, 140);
        getContentPane().add(mapel);
        mapel.setBounds(120, 160, 210, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("MAPEL       :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 160, 80, 30);

        reset.setBackground(new java.awt.Color(204, 0, 0));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(140, 470, 80, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Proses");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 240, 80, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\rendi\\Pictures\\Logo telkom\\Bombi.PNG")); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 540, 530);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String NAMA = nama.getText();
        String KELAS = kelas.getText();
        String ABSEN = absen.getText();
        String MAPE = mapel.getText();
        int NILAI = Integer.valueOf(nilai.getText());
        String ket = "";
        if (NILAI < 75) {
            ket = "Ketengangan Tidak lulus";
        } else if ((NILAI >= 75) && (NILAI < 100)) {
            ket = "Ketengangan lulus";
        } else if (NILAI==100 ) {
            ket = "Ketengangan Sempurna";
        }
        else if (NILAI>100 ) {
            ket = "Ketengangan Amazing";
        }
        TX.setText("Nama\t:"+NAMA+"\nKELAS\t:"+KELAS+"\nABSEN\t:"+ABSEN+"\nMAPEL\t:"+MAPE+"\nNILAI\t:"+NILAI+"\n=="+ket+"==");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
nama.setText("");
kelas.setText("");
absen.setText("");
mapel.setText("");
nilai.setText("");
TX.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
       dispose();
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penilaian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TX;
    private javax.swing.JTextField absen;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kelas;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField mapel;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nilai;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
