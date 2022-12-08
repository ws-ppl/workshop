/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package workshop_project;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author alans
 */
public class PembayaranGaji extends javax.swing.JFrame {

    
private void tabel(){    
    DefaultTableModel model2 = new DefaultTableModel();
        model2.addColumn("No");
        model2.addColumn("Nama Pengawai");
        model2.addColumn("Minus");
        model2.addColumn("Ket.Minus");
        model2.addColumn("Gaji");
        model2.addColumn("Bonus");
        
        
        try{
    int no =1 ;
    String sql = "SELECT pegawai.nama_pegawai, pengeluaran.nik, gaji.minus, gaji.keterangan_minus, pegawai.gaji_pegawai, gaji.bonus FROM pengeluaran JOIN pegawai on pengeluaran.nik = pegawai.nik JOIN gaji ON pengeluaran.id_pengeluaran= gaji.id_pengeluaran";
        Connection conn = (Connection)Config.configDB();
        Statement stm = conn.createStatement();
        ResultSet res = stm.executeQuery(sql);
          while(res.next()){
            model2.addRow(new Object[]{
                no++,
                
                res.getString(1),
                res.getString(3), 
                res.getString(4), 
                res.getString(5), 
                res.getString(6)});
          }
          jTable1.setModel(model2);
        }catch(Exception e){
        }
}

public void tampil_combo(){
    try{
        String sql= "select * from pegawai ";
        Connection conn = (Connection)Config.configDB();
        Statement stm = conn.createStatement();
        ResultSet res = stm.executeQuery(sql);
          while(res.next()){
        combo_namaPegawai.addItem(res.getString("nama_pegawai"));
          }
          res.last();
          int jumlahData = res.getRow();
          res.first();
    }catch(Exception e){
        
    }
        
}


    /**
     * Creates new form PembayaranGaji
     */
    public PembayaranGaji() {
        initComponents();
        tampil_combo();
        tabel();
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
        btn_dashboard = new javax.swing.JButton();
        btn_pegawai = new javax.swing.JButton();
        btn_gaji = new javax.swing.JButton();
        btn_pengeluaran = new javax.swing.JButton();
        btn_pendapatan = new javax.swing.JButton();
        btn_laporan = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_minus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_gaji = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_keterangan = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        txt_bonus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        combo_namaPegawai = new javax.swing.JComboBox<>();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Pembayaran Gaji - Jadi_Revisi Rezise.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btn_dashboard.setBackground(new java.awt.Color(244, 244, 244));
        btn_dashboard.setForeground(new java.awt.Color(169, 190, 191));
        btn_dashboard.setText("Dashboard");

        btn_pegawai.setBackground(new java.awt.Color(244, 244, 244));
        btn_pegawai.setForeground(new java.awt.Color(169, 190, 191));
        btn_pegawai.setText("Pegawai");
        btn_pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pegawaiActionPerformed(evt);
            }
        });

        btn_gaji.setBackground(new java.awt.Color(244, 244, 244));
        btn_gaji.setForeground(new java.awt.Color(169, 190, 191));
        btn_gaji.setText("Gaji");

        btn_pengeluaran.setBackground(new java.awt.Color(244, 244, 244));
        btn_pengeluaran.setForeground(new java.awt.Color(169, 190, 191));
        btn_pengeluaran.setText("Pengeluaran");

        btn_pendapatan.setBackground(new java.awt.Color(244, 244, 244));
        btn_pendapatan.setForeground(new java.awt.Color(169, 190, 191));
        btn_pendapatan.setText("Pendapatan");

        btn_laporan.setBackground(new java.awt.Color(244, 244, 244));
        btn_laporan.setForeground(new java.awt.Color(169, 190, 191));
        btn_laporan.setText("Laporan");

        btn_logout.setBackground(new java.awt.Color(251, 102, 101));
        btn_logout.setForeground(new java.awt.Color(169, 190, 191));
        btn_logout.setText("LOGOUT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gaji, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btn_dashboard)
                .addGap(18, 18, 18)
                .addComponent(btn_pegawai)
                .addGap(18, 18, 18)
                .addComponent(btn_gaji)
                .addGap(18, 18, 18)
                .addComponent(btn_pengeluaran)
                .addGap(18, 18, 18)
                .addComponent(btn_pendapatan)
                .addGap(18, 18, 18)
                .addComponent(btn_laporan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 190, 600);

        jPanel2.setBackground(new java.awt.Color(239, 245, 245));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        jLabel6.setText("Minus");

        jLabel4.setText("Bonus Gaji :");

        jLabel5.setText("Jumlah Gaji :");

        txt_keterangan.setText("Keterangan Minus :");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        txt_bonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bonusActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Pegawai :");

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(255, 16, 12));
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_simpan.setBackground(new java.awt.Color(255, 153, 50));
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_namaPegawai, 0, 199, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_minus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addComponent(jTextField4)
                        .addComponent(txt_keterangan, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gaji, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_bonus, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_namaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_bonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_keterangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_edit)
                    .addComponent(btn_hapus)
                    .addComponent(btn_simpan))
                .addGap(206, 206, 206))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(190, 0, 610, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pegawaiActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void txt_bonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bonusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO pegawai (nama_pegawai) VALUES ('"
                    +combo_namaPegawai.getItemAt(1)+"')";
            Connection conn = (Connection)Config.configDB();
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            
            String sql1 = "insert into gaji (minus, keterangan_minus, gaji_pegawai, bonus) values('"
                    +txt_minus.getText()+"','"+txt_keterangan.getText()+"','"
                    +txt_gaji.getText()+"','"+txt_bonus.getText()+"')";
            PreparedStatement pst1=conn.prepareStatement(sql1);
            pst1.execute();
            
            // memanggil ulang table
            tabel();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tabel();
    }//GEN-LAST:event_btn_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(PembayaranGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PembayaranGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PembayaranGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PembayaranGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PembayaranGaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_gaji;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_laporan;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_pegawai;
    private javax.swing.JButton btn_pendapatan;
    private javax.swing.JButton btn_pengeluaran;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> combo_namaPegawai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txt_bonus;
    private javax.swing.JTextField txt_gaji;
    private javax.swing.JLabel txt_keterangan;
    private javax.swing.JTextField txt_minus;
    // End of variables declaration//GEN-END:variables
}
