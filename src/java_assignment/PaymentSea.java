/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_assignment;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mannoj
 */
public class PaymentSea extends javax.swing.JFrame {
   
    private void initSelfListeners(){
    WindowListener taskStarterWindowListener = new WindowListener(){
        @Override
        public void windowOpened(WindowEvent e){
            String file = "SeaView.txt";
            BufferedReader r = null;
            String l;
            try{
                r = new BufferedReader (new FileReader (file));
                int count = 0;
                while((l = r.readLine()) !=null){
                    String[] i = l.split(",");
                    String roomID = i[0];
                    String status = i[1];
                    String checkIn = i[2];
                    String checkOut = i[3];
                    String DOS = i[4];
                    String Name = i[5];
                    String IC = i[6];
                    String Payment = i[7];
                    String Number = i[8];
                    String Email = i[9];
                    
                    DefaultTableModel model = (DefaultTableModel)Roomies.getModel();
                    model.addRow(new Object[]{roomID, status, checkIn, checkOut, DOS, Name, IC, Payment, Number, Email});
                   
                }
                    
            }catch(IOException ef){
                ef.printStackTrace();
            }finally{
                try{
                    r.close();
                }catch(IOException ea){
                    ea.printStackTrace();
                }
            }
    }
        @Override
        public void windowClosing(WindowEvent e) {
            
        }

        @Override
        public void windowClosed(WindowEvent e) {
            
        }

        @Override
        public void windowIconified(WindowEvent e) {
            
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            
        }

        @Override
        public void windowActivated(WindowEvent e) {
            
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
             
        }
    };
    this.addWindowListener(taskStarterWindowListener);

    }
    /**
     * Creates new form Payment
     */
    public PaymentSea() {
        initComponents();
        initSelfListeners();
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
        jButton1 = new javax.swing.JButton();
        roomid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Roomies = new javax.swing.JTable();
        Payme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pay = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        roomid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomidActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel2.setText("RoomID");

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel1.setText("Your Payment is");

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel3.setText("Days Of Stay");

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Roomies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "roomID", "status", "checkIn", "checkOut", "DOS", "Name", "IC", "Payment", "Number", "Email"
            }
        ));
        jScrollPane1.setViewportView(Roomies);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel4.setText("Input Payment");

        pay.setText("Do Payment");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel5.setText("Payment Sea");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Back)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roomid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(477, 477, 477)
                                .addComponent(Payme, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(pay)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(roomid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Payme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(pay)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            File file = new File("SeaView.txt");
            Scanner s = new Scanner(file);
            String ID = roomid.getText();
            if(ID.length() != 4) {
            JOptionPane.showMessageDialog(null, "Please enter a valid roomID");
            roomid.setText("");
            }
            while(s.hasNextLine())
            {
                String line = s.nextLine().trim();




                if(line.contains(ID))
                {

                    String[] record = line.split(",");

                    
                    String DOS = record[4];

                    //String ICNum = record[6];


                    
                    dos.setText(DOS);

                    //icnum.setText(ICNum);
                    
                    final double RoomAmount = 350;
                    final double TaxTourism = 10;
                    final double TaxService = 0.1;
                    
                    double days = Integer.parseInt(DOS);
                    
                    double hTotal = RoomAmount * days;//700
                    double aTotal = TaxService * hTotal;//htotal * 0.1 = 70
                    double rTotal = TaxTourism * days;// =20
                    double TotalAmount = hTotal + aTotal + rTotal;
                    Amount.setText("RM" + TotalAmount);
                    
                    /*if(pay.isSelected()){
                        String details = CoachID + "," + "Available" + "," + "0" + "," + "0" + "," + "0" + "," + "0" + "," + "0";
                        String mod = CoachID + "," + "Rented" + "," + BookingData.getCheckIn() + "," + BookingData.getCheckOut() + "," + BookingData.getNOD() + "," + BookingData.getCustName() + "," + BookingData.getICNum() + "," + "heelo";
                        
                        BufferedReader r = new BufferedReader(new FileReader(file));
                        String l = r.readLine();
                        while(l != null){
                            i = i + l + System.lineSeparator();
                            l = r.readLine();
                        }
                        String newC = i.replaceAll(details, mod);
                        FileWriter w = new FileWriter(file);
                        
                        w.write(newC);
                        w.close();
                        r.close();
                    }*/
                }
                else {
                    
                }
            }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PaymentSea.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
        int row = Roomies.getSelectedRow();
        String roomID = Roomies.getModel().getValueAt(row,0).toString();
        String status = Roomies.getModel().getValueAt(row,1).toString();
        String checkIn = Roomies.getModel().getValueAt(row,2).toString();
        String checkOut = Roomies.getModel().getValueAt(row,3).toString();
        String DOS = Roomies.getModel().getValueAt(row,4).toString();
        String Name = Roomies.getModel().getValueAt(row,5).toString();
        String IC = Roomies.getModel().getValueAt(row,6).toString();
        String Payment = Roomies.getModel().getValueAt(row,7).toString();
        String Number = Roomies.getModel().getValueAt(row,8).toString();
        String Mail = Roomies.getModel().getValueAt(row,9).toString();
        
        String details = roomID + "," + status + "," + checkIn + "," + checkOut + "," + DOS + "," + Name + "," + IC + "," + Payment + "," + Number + "," + Mail;
        String mod = roomID + "," + status + "," + checkIn + "," + checkOut + "," + DOS + "," + Name + "," + IC + "," + "RM" + Payme.getText() + "," + Number + "," + Mail;
        
        String file = "SeaView.txt";
        String i = "";
        
        try{
            BufferedReader r = new BufferedReader(new FileReader(file));
            String l = r.readLine();
            while(l != null){
                i = i + l + System.lineSeparator();
                l = r.readLine();
            }
            String newC = i.replaceAll(details, mod);
            FileWriter w = new FileWriter(file);
            w.write(newC);
            w.close();
            r.close();
            new ViewReceipt().setVisible(true);
            this.dispose();
        }catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_payActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        new MainPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    
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
            java.util.logging.Logger.getLogger(PaymentSea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentSea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentSea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentSea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentSea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JButton Back;
    private javax.swing.JTextField Payme;
    private javax.swing.JTable Roomies;
    private javax.swing.JTextField dos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pay;
    private javax.swing.JTextField roomid;
    // End of variables declaration//GEN-END:variables
    }