/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

import static nsbm.Main.load;

/**
 *
 * @author Pramuditha Kaushalya
 */
public class Student extends javax.swing.JPanel {

    private Main main;
    /**
     * Creates new form Student
     */
    public Student() {
        initComponents();
    }

    Student(Main main) {
        initComponents();
        this.main=main;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        postgraduate = new javax.swing.JButton();
        undergraduate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STUDENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        postgraduate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pramuditha Kaushalya\\Pictures\\postgraduate.png")); // NOI18N
        postgraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgraduateActionPerformed(evt);
            }
        });
        add(postgraduate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 290, 280));

        undergraduate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pramuditha Kaushalya\\Pictures\\undergraduate.jpg")); // NOI18N
        undergraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undergraduateActionPerformed(evt);
            }
        });
        add(undergraduate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 290, 280));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("POSTGRADUATE STUDENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 360, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("UNDERGRADUATE STUDENT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 360, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pramuditha Kaushalya\\Pictures\\update.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 250, 290, 280));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("UPDATE/DELETE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 570, 220, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void postgraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgraduateActionPerformed
        // TODO add your handling code here:
        PStudentForm object = new PStudentForm();
        main.load.removeAll();
        main.load.add(object);
        main.load.repaint();
        main.load.revalidate();
        object.setVisible(true);
    }//GEN-LAST:event_postgraduateActionPerformed

    private void undergraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undergraduateActionPerformed
        // TODO add your handling code here:
        StudentForm object = new StudentForm();     
        main.load.removeAll();
        main.load.add(object);
        main.load.repaint();
        main.load.revalidate();
        object.setVisible(true);
    }//GEN-LAST:event_undergraduateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        view object = new view();
        load.removeAll();
        load.add(object);
        load.repaint();
        load.revalidate();
        object.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton postgraduate;
    private javax.swing.JButton undergraduate;
    // End of variables declaration//GEN-END:variables
}