/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry_management_system;

import java.awt.Color;
import javax.swing.JProgressBar;

/**
 *
 * @author Abhinav
 */
public class Laundry_Management_System {
   JProgressBar jp;
    static Loading l;
       public void jp() {
                jp=new JProgressBar();
                jp.setBackground(Color.black);
                jp.setForeground(Color.red);
                l=new Loading();
                l.setVisible(true);
                l.add(jp);
                jp.setBounds(0, 601, 800, 35);
                jp.setValue(0);
                jp.setVisible(true);
                try{
                    //Thread t=new Thread();
                    for(int i=1;i<=100;i++){
                    Thread.sleep(15);
                    jp.setValue(i);
                    }
                }catch(Exception e){
                
                }
            }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Laundry_Management_System n=new Laundry_Management_System();
        n.jp();
        l.setVisible(false);
        new Main().setVisible(true);
        
    }
    
}
