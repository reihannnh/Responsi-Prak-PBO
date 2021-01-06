package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerHome {
    ViewHome viewhome;
    ViewPinjam viewpinjam;
    ViewTampil viewtampil;
    ViewAboutUs viewaboutus;
    
    public ControllerHome(ViewHome vh,ViewPinjam vp,ViewTampil vt,ViewAboutUs vau)
    {
        this.viewhome = vh;
        
        viewhome.jbpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vh.setVisible(false);
                vp.setVisible(true);
                
            }
            
         
        });
        
          viewhome.jbtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              vp.setVisible(false);
              vt.setVisible(true);
            }   
        });
          
          viewhome.jbaboutus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }) ;
    }
}
