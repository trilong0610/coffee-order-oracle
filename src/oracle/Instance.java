/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oracle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.System;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author qtrung1702
 */
public class Instance extends javax.swing.JFrame {

    /**
     * Creates new form SGA
     */
    Vector vdata=new Vector();
    Vector vheader = new Vector();
    OracleConnection oracle;
    public Instance(){
        setTitle("Thuộc tính CSDL");
        initComponents();
        oracle = new OracleConnection();
        vheader.add("Số thứ tự");
        vheader.add("Tên");
        vheader.add("Máy chủ");
        vheader.add("Phiên bản");
        vheader.add("Thời gian chạy");
        vheader.add("Trạng thái");
        vheader.add("Trạng thái CSDL");
        
        
        jTable1.setModel(new DefaultTableModel(vdata, vheader));
        try {
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(SGA.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("PGA"); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void loadData() throws SQLException
    {
        try
        {
            oracle.openConnection();
            String sql = "SELECT INSTANCE_NUMBER,INSTANCE_NAME,HOST_NAME,VERSION_FULL,STARTUP_TIME,STATUS,DATABASE_STATUS  FROM V$INSTANCE";
            Statement stmt = oracle.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                String pid = rs.getString("INSTANCE_NUMBER");
                String serial = rs.getString("INSTANCE_NAME");
                String category = rs.getString("HOST_NAME");
                String allocated = rs.getString("VERSION_FULL");
                String used = rs.getString("STARTUP_TIME");
                String max = rs.getString("STATUS");
                String conid = rs.getString("DATABASE_STATUS");
                Vector<String> v = new Vector<String>();
                v.add(pid);
                v.add(serial);
                v.add(category);
                v.add(allocated);
                v.add(used);
                v.add(max);
                v.add(conid);
                vdata.add(v);
                
            }
            jTable1.updateUI();
            oracle.closeConnection();
        } catch(SQLException ex)
        {
            Logger.getLogger(SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(SGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SGA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
