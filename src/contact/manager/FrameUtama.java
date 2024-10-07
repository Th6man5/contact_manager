/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contact.manager;

import config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Kelas FrameUtama adalah tampilan utama untuk aplikasi contact manager.
 * Kelas ini menampilkan kontak dalam bentuk tabel dan memiliki method
 * untuk menambah, mengedit, dan menghapus kontak yang tersimpan dalam database.
 * 
 * @author Raihan
 */
public class FrameUtama extends javax.swing.JFrame {

     /**
     * Koneksi ke database
     */
    private Connection conn;

    /**
     * Membuat form FrameUtama dan menginisialisasi komponen-komponennya.
     */
    public FrameUtama() {
        initComponents();
        conn = (Connection) Koneksi.getConnection();
        getData();
    }

    /**
     * Mengambil data dari tabel "contacts" dalam database dan menampilkannya pada tabel
     */
    private void getData() {
        DefaultTableModel contactTable = (DefaultTableModel) JTcontact.getModel();
        contactTable.setRowCount(0);

        try {
            String sql = "SELECT * FROM contacts";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String phone_numb = rs.getString("phone_numb");
                String email = rs.getString("email");
                String job_title = rs.getString("job_title");
                String company = rs.getString("company");

                Object[] rowData = {id, name, phone_numb, email, job_title, company};
                contactTable.addRow(rowData);
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FrameUtama.class.getName()).log(Level.SEVERE, null, e);
        }
    }

     /**
     * Mengosongkan semua input field .
     */
    private void resetForm() {
        tfName.setText("");
        tfPhonenumb.setText("");
        tfEmail.setText("");
        tfJobtitle.setText("");
        tfCompany.setText("");
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
        tfName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfPhonenumb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTcontact = new javax.swing.JTable();
        bAdd = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfJobtitle = new javax.swing.JTextField();
        tfCompany = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(51, 255, 153));

        tfName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Phone Number");

        tfPhonenumb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tfPhonenumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhonenumbActionPerformed(evt);
            }
        });

        JTcontact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Telepon", "email", "Job Title", "Company"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTcontact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTcontactMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTcontact);

        bAdd.setText("Add");
        bAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bEdit.setText("Edit");
        bEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Email");

        tfEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Job Title");

        tfJobtitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tfJobtitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJobtitleActionPerformed(evt);
            }
        });

        tfCompany.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tfCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCompanyActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("Company");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCompany)
                                    .addComponent(tfJobtitle)
                                    .addComponent(tfEmail)
                                    .addComponent(tfPhonenumb)
                                    .addComponent(tfName))))))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPhonenumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfJobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd)
                    .addComponent(bDelete)
                    .addComponent(bEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfPhonenumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhonenumbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhonenumbActionPerformed

    /**
     * Fungsi Button ini menambahkan data kontak
     * baru ke database dan memperbarui tampilan tabel.
     * @param evt Event ketika tombol Add ditekan.
     */
    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        // TODO add your handling code here:
        String name = tfName.getText();
        String phone_numb = tfPhonenumb.getText();
        String email = tfEmail.getText();
        String job_title = tfJobtitle.getText();
        String company = tfCompany.getText();
        if (!name.equalsIgnoreCase("") && !phone_numb.equalsIgnoreCase("") && !email.equalsIgnoreCase("") && !job_title.equalsIgnoreCase("") && !company.equalsIgnoreCase("")) {

            try {
                String sql = "INSERT INTO contacts (name,phone_numb,email,job_title,company) VALUES (?,?,?,?,?)";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, name);
                st.setString(2, phone_numb);
                st.setString(3, email);
                st.setString(4, job_title);
                st.setString(5, company);

                int rowInserted = st.executeUpdate();
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Contact Successfully Added!");
                    resetForm();
                    getData();
                }

                st.close();

            } catch (Exception e) {
                Logger.getLogger(FrameUtama.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "All Collumn need to be filled!");
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfJobtitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJobtitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJobtitleActionPerformed

    private void tfCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCompanyActionPerformed

    /**
     * Fungsi ini memperbarui kontak yang dipilih dari tabel
     * dan menyimpannya ke database.
     * @param evt Event ketika tombol Edit ditekan.
     */
    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        // TODO add your handling code here:
        int selectedRow = JTcontact.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pick a row from the table to edit!");
            return;
        }

        String id = JTcontact.getValueAt(selectedRow, 0).toString();
        String name = tfName.getText();
        String phone_numb = tfPhonenumb.getText();
        String email = tfEmail.getText();
        String job_title = tfJobtitle.getText();
        String company = tfCompany.getText();

        if (!name.equalsIgnoreCase("") && !phone_numb.equalsIgnoreCase("") && !email.equalsIgnoreCase("") && !job_title.equalsIgnoreCase("") && !company.equalsIgnoreCase("")) {
            try {
                String sql = "UPDATE contacts SET name=?, phone_numb=?, email=?, job_title=?, company=? WHERE id=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, name);
                st.setString(2, phone_numb);
                st.setString(3, email);
                st.setString(4, job_title);
                st.setString(5, company);
                st.setString(6, id);

                int rowUpdated = st.executeUpdate();

                if (rowUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Contact Successfully Updated!");
                    resetForm();
                    getData();
                }

                st.close();

            } catch (Exception e) {
                Logger.getLogger(FrameUtama.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "All Collumn need to be filled!");
        }
    }//GEN-LAST:event_bEditActionPerformed

     /**
     * Fungsi ini mengisi field input berdasarkan data
     * dari baris yang dipilih.
     * @param evt Event saat baris tabel diklik.
     */
    private void JTcontactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTcontactMouseClicked
        // TODO add your handling code here:
        int selectedRow = JTcontact.getSelectedRow();
        if (selectedRow != -1) {
            String name = JTcontact.getValueAt(selectedRow, 1).toString();
            String phone_numb = JTcontact.getValueAt(selectedRow, 2).toString();
            String email = JTcontact.getValueAt(selectedRow, 3).toString();
            String job_title = JTcontact.getValueAt(selectedRow, 4).toString();
            String company = JTcontact.getValueAt(selectedRow, 5).toString();

            tfName.setText(name);
            tfPhonenumb.setText(phone_numb);
            tfEmail.setText(email);
            tfJobtitle.setText(job_title);
            tfCompany.setText(company);
        }
    }//GEN-LAST:event_JTcontactMouseClicked

     /**
     * Fungsi ini menghapus kontak yang dipilih
     * dari tabel dan database.
     * @param evt Event ketika tombol Delete ditekan.
     */
    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = JTcontact.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pick a row from the table to delete!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String id = JTcontact.getValueAt(selectedRow, 0).toString();

            try {
                String sql = "DELETE FROM contacts WHERE id=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, id);

                int rowDelete = st.executeUpdate();
                if (rowDelete > 0) {
                    JOptionPane.showMessageDialog(this, "Contact successfully deleted!");
                    resetForm();
                    getData();
                }

                st.close();
            } catch (Exception e) {
                Logger.getLogger(FrameUtama.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTcontact;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfCompany;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfJobtitle;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhonenumb;
    // End of variables declaration//GEN-END:variables
}
