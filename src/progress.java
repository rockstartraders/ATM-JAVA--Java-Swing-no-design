import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


  // Set up to as default 

//https://www.javaworld.com/article/2077467/core-java/java-tip-104--make-a-splash-with-swing.html
// difficulty level is high hahaha


public class progress {
    
    public static void main ( String [] args){
        
        splash loading = new splash();
        loading.setVisible(true);
        Menu menu = new Menu();
        
            
        try {
         for (int i = 0; i<=101; i++){
                   Thread.sleep(85);
          loading.jLabel1.setText(Integer.toString(i)+  "% COMPLETED"); 
          loading.jProgressBar2.setValue(i);
          
           
           
        if ( i == 101){
            loading.setVisible(false);
            First first = new First();
            first.setVisible(true);
                       
       }
                         
       }      
              }catch(Exception e) {
                     
              
        
              
    }            
    }}
    


   
    

