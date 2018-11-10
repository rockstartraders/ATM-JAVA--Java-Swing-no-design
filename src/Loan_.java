import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.*;





public class Loan_ extends javax.swing.JFrame {

Connection conn;  // Connection to DB
ResultSet rs;   // Resultset for Push 
PreparedStatement pst;  // Set    


    public Loan_() {
     super("Loan");
        initComponents();
        conn =javadbconnect.ConnecrDB();
        
         // disable buttons for the meantime 
        
         jButton1.setEnabled(false);
         jButton2.setEnabled(false);
         jButton3.setEnabled(false); 
         jButton4.setEnabled(true);
         jButton5.setEnabled(false);
         jCheckBox1.setEnabled(false);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel1.setText("Loan Amount*  ");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel2.setText("Interest Rate");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel3.setText("Months to Pay* ");

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel4.setText("Total Amount of Interest ");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Monospaced", 1, 14));
        jTextField2.setText("5");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Monospaced", 1, 14));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel9.setText("PHP");

        jButton1.setText("CALCULATE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel11.setText("PHP");

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel8.setText("Months");

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel10.setText("% Percent ");

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel12.setText("Account no.* ");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel13.setText("Name");

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton3.setText("CHECK");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel14.setText("Card No. ");

        jTextField7.setEditable(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel15.setText("Card Type. ");

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 14));
        jLabel16.setText("Current Balance");

        jTextField9.setEditable(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 18));
        jLabel17.setText("         Please Complete the Information Below");

        jButton2.setText("SUBMIT FORM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Read Terms and Condition");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jCheckBox1.setText(" I Agree With the said Terms and Condition");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });

        jLabel19.setText("Note : Fields with asterisk * are required field dont leave it empty.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addGap(311, 311, 311)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addGap(190, 190, 190))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel2)
                            .addGap(27, 27, 27))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))))
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jCheckBox1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(224, 224, 224))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel17)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(7, 7, 7)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jLabel12, jLabel13, jLabel14, jLabel15, jTextField5, jTextField6, jTextField7, jTextField8});

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Calculate Button 
        
        double
           principal ,
           interest ,
           months, 
           total_interest;
        
                
        
        principal = Double.parseDouble(jTextField1.getText());
        interest = Double.parseDouble(jTextField2.getText());
        months = Double.parseDouble(jTextField3.getText());
        // total_interest = principal * interest * years / 100;
        total_interest = principal * interest/100 * months;
        jTextField4.setText("" + total_interest);
        
        
                 
    }                                        

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Check Button for Balance Inquiry
        String sql="select * from Account where Acc=?";
        try{
           pst=conn.prepareStatement(sql);
           pst.setString(1, jTextField5.getText());
           rs=pst.executeQuery();
           if(rs.next()){
               String add1=rs.getString("Name"); // this is name of the DB Variable 
               jTextField6.setText(add1);
               
               String add2=rs.getString("Cardno"); // this is name of the DB Variable
               jTextField7.setText(add2);
               
               String add3=rs.getString("Ctype"); // this is name of the DB Variable
               jTextField8.setText(add3);
               
               String add4=rs.getString("Balance"); // this is name of the DB Variable
               jTextField9.setText(add4);
           } 
           
           else{
               JOptionPane.showMessageDialog(null, " Amount Has Been Deposited");
           }
           
              rs.close();   // to avoid the DB lockout since 2 instance will run
              pst.close(); 
              
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            
               
    }                   
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Confirmation message
        JOptionPane.showMessageDialog(null,"Thank you for Transacting with us ... " + jTextField6.getText() +  "\n Your Loan Request Has been Received amounting to PHP  " + jTextField1.getText()+" \n A Text Message will be send out to your number once your loan request is approved \n Hence a notification from our bank representative will be receive in case this  request is revoke." );
        
         new Menu().setVisible(true); 
         this.setVisible(false); 
        
        
        
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
          // Dialog for exit / Cancel Transaction 
        int YesOrNo = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To \n Close This Transaction ? ","EXIT", JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0)
        {  
         new Menu().setVisible(true); 
         this.setVisible(false); 
         
         
         
        }     
    }                                        

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // enable check button
        
         jButton1.setEnabled(false);
         jButton2.setEnabled(false);
         jButton3.setEnabled(true); 
         jButton4.setEnabled(true);
        
    }                                       

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {                                       
        // Check button disable again 
        
         jButton1.setEnabled(false);
         jButton2.setEnabled(false);
         jButton3.setEnabled(false); 
         jButton4.setEnabled(true);
        
    }                                      

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {                                        
        
        
        
    }                                       

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {                                     
         jButton1.setEnabled(true);
         jButton2.setEnabled(false);
         jButton3.setEnabled(false); 
         jButton4.setEnabled(true);  
         jButton5.setEnabled(false); 
         
        // No Characters allowed just int  
        
       char a=evt.getKeyChar();
       if(!(Character.isDigit(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
       getToolkit().beep();
       evt.consume();
       
       }
        
    }                                    

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {                                        
             
    }                                       

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {                                       
        // Activate Submit Form 
         jButton1.setEnabled(true);
         jButton2.setEnabled(false);
         jButton3.setEnabled(false); 
         jButton4.setEnabled(true);
         jButton5.setEnabled(true);
         
         jButton1.setEnabled(false);
         jButton2.setEnabled(false);
         jButton3.setEnabled(false); 
         jButton4.setEnabled(true);
         jButton5.setEnabled(true);
    }                                      

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Going to terms and agreement page
        
         new Terms_and_Condition().setVisible(true);
         
    }                                        

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {                                       
        // Activate checkbox
        
         jButton1.setEnabled(false);
         jButton2.setEnabled(false);
         jButton3.setEnabled(false); 
         jButton4.setEnabled(true);
         jButton5.setEnabled(true);
         jCheckBox1.setEnabled(true);
    }                                      

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // when accepted submit will show 
        
         jButton1.setEnabled(false);
         jButton2.setEnabled(true);
         jButton3.setEnabled(false); 
         jButton4.setEnabled(true);  
         jButton5.setEnabled(false); 
    }                                       

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {
       
       // No Characters allowed just int  
        
       char a=evt.getKeyChar();
       if(!(Character.isDigit(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
       getToolkit().beep();
       evt.consume();
       
       }
    }

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {
        // No Characters allowed just int 
        
        
        
        
       char a=evt.getKeyChar();
       if(!(Character.isDigit(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
       getToolkit().beep();
       evt.consume();
       
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
            java.util.logging.Logger.getLogger(Loan_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loan_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loan_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loan_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Loan_().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration
}
