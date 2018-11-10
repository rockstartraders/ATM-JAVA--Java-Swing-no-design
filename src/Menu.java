
// Import for Soundstream
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.audio.*;

public class Menu extends javax.swing.JFrame {
    
    
         
      
   
    public Menu() {
        initComponents();
         showDate();    // Declare date and time 
         showTime();
         
           }

    // date and time 
    // use this as reference 
    //https://stackoverflow.com/questions/13366780/how-to-add-real-time-date-and-time-into-a-jframe-component-e-g-status-bar
    //
    
    
    
    
    void showDate(){
     Date d = new Date();
     SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
     jLabel1.setText(s.format(d));   
            
    
    }
    void showTime(){
     Date d = new Date();
     SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
     jLabel2.setText(s.format(d));   
            
        }
    
    
   // end of date and time 
      
      
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setAutoRequestFocus(false);

        jButton3.setFont(new java.awt.Font("Monospaced", 1, 18));
        jButton3.setText("WITHDRAW");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Monospaced", 1, 18));
        jButton5.setText("EASY LOAN");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Monospaced", 1, 18));
        jButton4.setText("DEPOSIT");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18));
        jButton2.setText("BALANCE INQUIRY");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18));
        jButton1.setText("CHANGE PIN");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Monospaced", 1, 18));
        jButton6.setText("EXIT");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6});

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18));
        jLabel1.setText("DATE ");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18));
        jLabel2.setText("TIME");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18));
        jLabel3.setText("DATE: ");

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18));
        jLabel4.setText("TIME: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // sound clip   
            // http://www.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html
            InputStream in;
            try{
            in = new FileInputStream(new File("C:\\Users\\GAMING_RIG\\Documents\\NetBeansProjects\\ATM_project\\Sound Files\\balanceinquiry.wav"));
            AudioStream Bal_Inq = new AudioStream (in);
            AudioPlayer.player.start(Bal_Inq); 
            
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
              
            }              
           
           // Button for Balance Inq. 
           Thread.sleep(2000);   // Delay function in ms format  
           new binquiry().setVisible(true);
           this.setVisible(false);
           } catch (InterruptedException ex) {
           Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
           } // choose the option to wrap with 
                                                                                // catch
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // sound clip   
              // http://www.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html
             InputStream in;
             try{
             in= new FileInputStream(new File("C:\\Users\\GAMING_RIG\\Documents\\NetBeansProjects\\ATM_project\\Sound Files\\changepin.wav"));
             AudioStream Pin_change = new AudioStream (in);
             AudioPlayer.player.start(Pin_change); 
             
             }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
               }
                              
               // open new object -- pin section
               Thread.sleep(1000);   // Delay function in ms format
               new pin().setVisible(true);
               this.setVisible(false);
              } catch (InterruptedException ex) {
               Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               } // choose the option to wrap with // catch
                                                                                
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // sound clip   
            // http://www.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html
            InputStream in;
            try{
            in = new FileInputStream(new File("C:\\Users\\GAMING_RIG\\Documents\\NetBeansProjects\\ATM_project\\Sound Files\\Deposit.wav"));
            AudioStream Deposit = new AudioStream (in);
            AudioPlayer.player.start(Deposit); 
            
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
              
            }   
           
           
           
           
           // Back Button 
           Thread.sleep(1000);   // Delay function in ms format 
           // see : https://www.java-forums.org/new-java/14288-how-give-delay.html
           
           new Depositwithinfo().setVisible(true);
           this.setVisible(false);
           } catch (InterruptedException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
           }  // choose the option to wrap with // catch
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            // sound clip   
            // http://www.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html
            InputStream in;
            try{
            in = new FileInputStream(new File("C:\\Users\\GAMING_RIG\\Documents\\NetBeansProjects\\ATM_project\\Sound Files\\exit.wav"));
            AudioStream Exit = new AudioStream (in);
            AudioPlayer.player.start(Exit); 
            
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
              
            }   
           
           
           
           
           // Exit Button
           Thread.sleep(2000);   // Delay function 
                                 // see : https://www.java-forums.org/new-java/14288-how-give-delay.html
           
           new First().setVisible(true);
           this.setVisible(false);
           dispose();
           
            } catch (InterruptedException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex); // choose the option to wrap with 
                                                                                // catch
            }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // sound clip   
            // http://www.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html
            InputStream in;
            try{
            in = new FileInputStream(new File("C:\\Users\\GAMING_RIG\\Documents\\NetBeansProjects\\ATM_project\\Sound Files\\Withdraw.wav"));
            AudioStream Widthraw = new AudioStream (in);
            AudioPlayer.player.start(Widthraw); 
            
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
              
            }    
           
                   
           // Button for Widthraw
           Thread.sleep(2000);   // Delay function 
           // see : https://www.java-forums.org/new-java/14288-how-give-delay.html 
           
           new Withdraw().setVisible(true);
           this.setVisible(false);
           } catch (InterruptedException ex) {
           Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
           // choose the option to wrap with // catch
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            // sound clip   
           // http://www.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html
           InputStream in;
           try{
           in = new FileInputStream(new File("C:\\Users\\GAMING_RIG\\Documents\\NetBeansProjects\\ATM_project\\Sound Files\\Loan request.wav"));
           AudioStream Load = new AudioStream (in);
           AudioPlayer.player.start(Load); 
           
           }
           catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
             
           }   
       
       // open new object -- Sign in page
       Thread.sleep(2000);   // Delay function 
       // see : https://www.java-forums.org/new-java/14288-how-give-delay.html    
       new Loan_().setVisible(true);
       this.setVisible(false);
       } catch (InterruptedException ex) {
       Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
         // choose the option to wrap with // catch
                                                                                
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
