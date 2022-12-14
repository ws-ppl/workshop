/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package workshop_project;

/**
 * @author bima
 */

import java.awt.event.KeyEvent;
import java.sql.*;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;
import javax.swing.table.TableModel;

import workshop_project.Workshop_project;

public class master_pegawai extends javax.swing.JFrame {
    /**
     * Creates new form master_pegawai
     */
    public master_pegawai() {
        initComponents();
        tabel();
        tanggal.setText(getDate());
    }
    
    // menampilkan tanggal di layar
    static String getDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime dt = LocalDateTime.now();
        return String.valueOf(dtf.format(dt));
    }
   
    // isi table
    private void tabel(){
        DefaultTableModel tb= new DefaultTableModel();
        // Memberi nama pada setiap kolom tabel
        tb.addColumn("NIK");
        tb.addColumn("Nama Pegawai");
        tb.addColumn("Username");
        tb.addColumn("Alamat");
        tb.addColumn("No. Telpon ");
        tb.addColumn("Jenis Kelamin");
        tb.addColumn("Gaji Pegawai");
        tabel.setModel(tb);
    try{
        // Mengambil data dibuat dari database
        Statement statement=(Statement)Workshop_project.foderoDB().createStatement();
        ResultSet rs=statement.executeQuery("select * from pegawai group by created_at order by created_at desc");

    while (rs.next())
    {
        // Mengambil data dari database berdasarkan nama kolom pada tabel
        // Lalu di tampilkan ke dalam Table
        tb.addRow(new Object[]{
        rs.getString("nik"),
        rs.getString("nama_pegawai"),
        rs.getString("username"),
        rs.getString("alamat"),
        rs.getString("no_telp"),
        rs.getString("jenis_kelamin"),
        rs.getInt("gaji_pegawai")
        });
        tabel.setModel(tb);
    }
    }catch (Exception e){
        JOptionPane.showMessageDialog(rootPane, e.getMessage());
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenis_kelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        field_nama = new javax.swing.JTextField();
        field_alamat = new javax.swing.JTextField();
        field_username = new javax.swing.JTextField();
        field_nik = new javax.swing.JTextField();
        field_gaji = new javax.swing.JTextField();
        field_nomer = new javax.swing.JTextField();
        field_password = new javax.swing.JPasswordField();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        rdb_laki = new javax.swing.JRadioButton();
        rdb_perempuan = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        cari_data = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        tanggal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(114, 114, 114));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 140, 170, 30);

        jPanel4.setBackground(new java.awt.Color(167, 191, 191));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 114, 114));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pegawai");
        jPanel4.add(jLabel3);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 180, 170, 30);

        jPanel5.setBackground(new java.awt.Color(244, 244, 244));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(114, 114, 114));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gaji");
        jPanel5.add(jLabel4);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 220, 170, 30);

        jPanel6.setBackground(new java.awt.Color(244, 244, 244));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(114, 114, 114));
        jLabel5.setText("Pengeluaran");
        jPanel6.add(jLabel5);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(10, 260, 170, 30);

        jPanel7.setBackground(new java.awt.Color(244, 244, 244));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(114, 114, 114));
        jLabel6.setText("Pendapatan");
        jPanel7.add(jLabel6);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(10, 300, 170, 30);

        jPanel8.setBackground(new java.awt.Color(244, 244, 244));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(114, 114, 114));
        jLabel7.setText("Laporan");
        jPanel8.add(jLabel7);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(10, 340, 170, 30);

        jPanel2.setBackground(new java.awt.Color(239, 245, 245));
        jPanel2.setName("panel atas"); // NOI18N
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 70);

        jPanel9.setBackground(new java.awt.Color(252, 102, 103));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("LOGOUT");
        jPanel9.add(jLabel8);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(20, 470, 150, 40);

        field_nama.setBackground(new java.awt.Color(255, 255, 255));
        field_nama.setForeground(new java.awt.Color(114, 114, 114));
        getContentPane().add(field_nama);
        field_nama.setBounds(230, 140, 220, 28);

        field_alamat.setBackground(new java.awt.Color(255, 255, 255));
        field_alamat.setForeground(new java.awt.Color(114, 114, 114));
        getContentPane().add(field_alamat);
        field_alamat.setBounds(230, 180, 220, 28);

        field_username.setBackground(new java.awt.Color(255, 255, 255));
        field_username.setForeground(new java.awt.Color(114, 114, 114));
        getContentPane().add(field_username);
        field_username.setBounds(230, 220, 220, 28);

        field_nik.setBackground(new java.awt.Color(255, 255, 255));
        field_nik.setForeground(new java.awt.Color(114, 114, 114));
        getContentPane().add(field_nik);
        field_nik.setBounds(530, 140, 230, 28);

        field_gaji.setBackground(new java.awt.Color(255, 255, 255));
        field_gaji.setForeground(new java.awt.Color(114, 114, 114));
        getContentPane().add(field_gaji);
        field_gaji.setBounds(530, 180, 230, 28);

        field_nomer.setBackground(new java.awt.Color(255, 255, 255));
        field_nomer.setForeground(new java.awt.Color(114, 114, 114));
        getContentPane().add(field_nomer);
        field_nomer.setBounds(530, 220, 230, 28);

        field_password.setBackground(new java.awt.Color(255, 255, 255));
        field_password.setForeground(new java.awt.Color(114, 114, 114));
        getContentPane().add(field_password);
        field_password.setBounds(530, 260, 230, 28);

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit);
        btn_edit.setBounds(503, 470, 80, 28);

        btn_hapus.setBackground(new java.awt.Color(255, 16, 12));
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus);
        btn_hapus.setBounds(590, 470, 80, 28);

        btn_simpan.setBackground(new java.awt.Color(255, 153, 50));
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan);
        btn_simpan.setBounds(673, 470, 80, 28);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(114, 114, 114));
        jLabel11.setText("Nama Pegawai :");

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(114, 114, 114));
        jLabel12.setText("Alamat :");

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(114, 114, 114));
        jLabel13.setText("Username :");

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(114, 114, 114));
        jLabel14.setText("NIK :");

        jLabel15.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(114, 114, 114));
        jLabel15.setText("Gaji Pegawai :");

        jLabel16.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(114, 114, 114));
        jLabel16.setText("No Telpon :");

        jLabel17.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(114, 114, 114));
        jLabel17.setText("Password :");

        jLabel18.setForeground(new java.awt.Color(114, 114, 114));
        jLabel18.setText("Cari Data");

        jenis_kelamin.add(rdb_laki);
        rdb_laki.setForeground(new java.awt.Color(114, 114, 114));
        rdb_laki.setText("Laki-laki");

        jenis_kelamin.add(rdb_perempuan);
        rdb_perempuan.setForeground(new java.awt.Color(114, 114, 114));
        rdb_perempuan.setText("Perempuan");
        rdb_perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_perempuanActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(114, 114, 114));
        jLabel19.setText("Jenis Kelamin :");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        cari_data.setBackground(new java.awt.Color(255, 255, 255));
        cari_data.setForeground(new java.awt.Color(114, 114, 114));
        cari_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_dataActionPerformed(evt);
            }
        });
        cari_data.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cari_dataKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(163, 163, 163))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(rdb_laki, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdb_perempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cari_data, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel17))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_laki, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdb_perempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cari_data, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10);
        jPanel10.setBounds(200, 120, 580, 390);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(114, 114, 114));
        jLabel9.setText("Nama Pegawai");
        jPanel11.add(jLabel9);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(40, 84, 100, 25);

        jPanel12.setBackground(new java.awt.Color(239, 245, 245));
        jPanel12.setBorder(null);
        getContentPane().add(jPanel12);
        jPanel12.setBounds(750, 70, 50, 20);

        jPanel13.setBackground(new java.awt.Color(239, 245, 245));
        jPanel13.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        tanggal.setFont(new java.awt.Font("Lexend", 0, 13)); // NOI18N
        tanggal.setForeground(new java.awt.Color(114, 114, 114));
        tanggal.setText("Tanggal");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(tanggal)
                .addGap(0, 148, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel13);
        jPanel13.setBounds(200, 80, 200, 30);

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/workshop_project/Master Pegawai - Jadi_Revisi.jpg"))); // NOI18N
        jLabel2.setName("gambar dasar"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 70, 800, 449);

        jPanel3.setBackground(new java.awt.Color(239, 245, 245));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 510, 800, 90);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdb_perempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_perempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_perempuanActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        try{
            String jenis_kelamin = null; 
            if(rdb_laki.isSelected()){
                jenis_kelamin = "Laki-Laki";
            }else if(rdb_perempuan.isSelected()){
                jenis_kelamin = "Perempuan";
            }
            
            String tipe = "karyawan";
            String sql = "INSERT INTO pegawai (nik,nama_pegawai,username,PASSWORD,alamat,no_telp,jenis_kelamin,tipe,gaji_pegawai,created_at) VALUES ('"+field_nik.getText()+"','"+field_nama.getText()+"',"
                    + "'"+field_username.getText()+"','"+field_password.getText()+"',"
                    + "'"+field_alamat.getText()+"','"+field_nomer.getText()+"',"
                    + "'"+jenis_kelamin+"',"
                    + "'"+tipe+"','"+field_gaji.getText()+"', now())";
            java.sql.Connection conn = (Connection)Workshop_project.foderoDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            // memanggil ulang table
            tabel();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM pegawai where nik='"+field_nik.getText()+"'";
            java.sql.Connection conn = (Connection)Workshop_project.foderoDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tabel();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int i = tabel.getSelectedRow();
        TableModel tbl = tabel.getModel();
        // Mengambil value dari table
        String field1 = tbl.getValueAt(i, 0).toString();
        String field2 = tbl.getValueAt(i, 1).toString();
        String field3 = tbl.getValueAt(i, 2).toString();
        String field4 = tbl.getValueAt(i, 3).toString();
        String field5 = tbl.getValueAt(i, 4).toString();
        String field6 = tbl.getValueAt(i, 5).toString();
        String field7 = tbl.getValueAt(i, 6).toString();
        // Paste data yang telah diambil
        field_nik.setText(field1);
        field_nik.disable();
        field_nama.setText(field2);
        field_username.setText(field3);
        field_alamat.setText(field4);
        field_nomer.setText(field5);
        if(field6.equals("Laki-Laki")){
            rdb_laki.setSelected(true);
        }else{
            rdb_perempuan.setSelected(true);
        }
        field_gaji.setText(field7);
    }//GEN-LAST:event_tabelMouseClicked

    private void cari_dataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cari_dataKeyPressed
        // TODO add your handling code here:
        String cari = cari_data.getText();

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("nik");
        dtm.addColumn("nama_pegawai");
        dtm.addColumn("username");
        dtm.addColumn("alamat");
        dtm.addColumn("no_telp");
        dtm.addColumn("jenis_kelamin");
        dtm.addColumn("gaji_pegawai");
        tabel.setModel(dtm);
        try {
            Statement statement = (Statement)Workshop_project.foderoDB().createStatement();
            ResultSet res = statement.executeQuery("select * from pegawai where nik like '%"+cari+"%' or nama_pegawai like '%"+cari+"%'");

            while(res.next()){
                dtm.addRow(new Object[]{
                    res.getString("nik"),
                    res.getString("nama_pegawai"),
                    res.getString("username"),
                    res.getString("alamat"),
                    res.getString("no_telp"),
                    res.getString("jenis_kelamin"),
                    res.getString("gaji_pegawai")
                });
                tabel.setModel(dtm);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cari_dataKeyPressed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE pegawai SET nama_pegawai = '"+ field_nama.getText()
                    +"', username = '"+field_username.getText()+"', PASSWORD = '"+ field_password.getText()
                    +"', alamat = '"+field_alamat.getText()+"', no_telp = '"+ field_nomer.getText()
                    +"', gaji_pegawai = '"+ field_gaji.getText() + "'WHERE nik = '"+field_nik.getText()+"'";
            java.sql.Connection conn=(Connection)Workshop_project.foderoDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diedit");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Perubahan data gagal" + e.getMessage());
        }
        tabel();
    }//GEN-LAST:event_btn_editActionPerformed

    private void cari_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cari_dataActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
            new PembayaranGaji().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

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
            java.util.logging.Logger.getLogger(master_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(master_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(master_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(master_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new master_pegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JTextField cari_data;
    private javax.swing.JTextField field_alamat;
    private javax.swing.JTextField field_gaji;
    private javax.swing.JTextField field_nama;
    private javax.swing.JTextField field_nik;
    private javax.swing.JTextField field_nomer;
    private javax.swing.JPasswordField field_password;
    private javax.swing.JTextField field_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jenis_kelamin;
    private javax.swing.JRadioButton rdb_laki;
    private javax.swing.JRadioButton rdb_perempuan;
    private javax.swing.JTable tabel;
    private javax.swing.JLabel tanggal;
    // End of variables declaration//GEN-END:variables

}