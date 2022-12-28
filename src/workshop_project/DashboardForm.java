/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop_project;

import java.awt.BorderLayout;
import java.awt.Color;
import org.jfree.data.category.DefaultCategoryDataset;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;

/**
 *
 * @author Tole
 */
public class DashboardForm extends javax.swing.JFrame {

    ArrayList<Integer> total_pengeluaran = new ArrayList<Integer>();
    ArrayList<Integer> total_pemasukan = new ArrayList<Integer>();
    String[] bulan = {"Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Agu", "Sep", "Okt", "Nov", "Des"};
    /**
     * Creates new form DashboardForm
     */
    public DashboardForm() {
        initComponents();
        try {
            showPengeluaranChart();
            showPemasukanChart();
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void showPengeluaranChart() throws SQLException{
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Statement st = (Statement) Utils.foderoDB().createStatement();
        for (int i = 1; i <= 12; i++) {
            int total = 0;
            String query = "Select sum(jumlah_pengeluaran) as jumlah from pengeluaran where month(tanggal_pengeluaran) = " + i;
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                total = (rs.getString("jumlah") != null) ? Integer.valueOf(rs.getString("jumlah")) : 0;
                System.out.println("test");
            }
//            System.out.println(total);
            total_pengeluaran.add(total);
        }
        
        for (int i = 0; i < 12; i++) {
            dataset.setValue(total_pengeluaran.get(i), "Total", bulan[i]);
        }
        JFreeChart chart = ChartFactory.createBarChart("Pengeluaran", "Bulan", "Total", dataset, PlotOrientation.VERTICAL, false, true, false);
        
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        BarRenderer render = (BarRenderer) plot.getRenderer();
        Color clr = new Color(204, 0, 51);
        render.setSeriesFillPaint(0, clr);
        
        ChartPanel cp = new ChartPanel(chart);
        jPanel1.removeAll();
        jPanel1.add(cp, BorderLayout.CENTER);
        jPanel1.validate();
    }
    
    void showPemasukanChart() throws SQLException{
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Statement st = (Statement) Utils.foderoDB().createStatement();
        for (int i = 1; i <= 12; i++) {
            int total = 0;
            String query = "Select sum(jumlah_pendapatan) as jumlah from pendapatan where month(tanggal_pemasukan) = " + i;
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                total = (rs.getString("jumlah") != null) ? Integer.valueOf(rs.getString("jumlah")) : 0;
                System.out.println("test");
            }
//            System.out.println(total);
            total_pemasukan.add(total);
        }
        
        for (int i = 0; i < 12; i++) {
            dataset.setValue(total_pemasukan.get(i), "Total", bulan[i]);
        }
        JFreeChart chart = ChartFactory.createBarChart("Pemasukan", "Bulan", "Total", dataset, PlotOrientation.VERTICAL, false, true, false);
        
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        BarRenderer render = (BarRenderer) plot.getRenderer();
        Color clr = new Color(204, 0, 51);
        render.setSeriesFillPaint(0, clr);
        
        ChartPanel cp = new ChartPanel(chart);
        jPanel2.removeAll();
        jPanel2.add(cp, BorderLayout.CENTER);
        jPanel2.validate();
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
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
