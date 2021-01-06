package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControllerResponsi {
    
      
    ModelResponsi modelaunt;
    ViewResponsi viewaunt;
    ViewDaftar viewdaftar;
    ViewHome viewhome;
            
    public ControllerResponsi(ViewResponsi vpc, ModelResponsi mpc, ViewDaftar vdc, ViewHome vdh) {
        this.modelaunt = mpc;
        this.viewaunt = vpc;
        this.viewdaftar = vdc;
        this.viewhome = vdh;
       

   
        
         viewaunt.jblogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username= viewaunt.getUsername();
                String password = viewaunt.getPassword();
                
               if(modelaunt.login(username,password))  
            {
              JOptionPane.showMessageDialog(null, "Login Sukses");
                   viewhome.setVisible(true);
                   viewaunt.dispose();
            }
         else
            {
              JOptionPane.showMessageDialog(null, "Login Gagal");
            }
               
            }
            
          
        });
         
         viewaunt.jbdaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewaunt.setVisible(false);
                viewaunt.dispose();
                
                viewdaftar.setVisible(true);

            }
                 });
         
          viewdaftar.jbdaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username= viewdaftar.getUsername();
                String password = viewdaftar.getPassword();
                System.out.println(username);
                if(modelaunt.daftar(username, password))
                {
                    JOptionPane.showMessageDialog(null,"Berhasil");
               
                    
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "Username sudah terdaftar");
                }
            
            }
            
          
        });
          
          viewdaftar.jbbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 viewaunt.setVisible(true);
                 viewdaftar.dispose();
         
            }
        });
              
        
     
    }
}
