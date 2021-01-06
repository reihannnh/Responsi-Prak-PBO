package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerPinjam {
    
    ModelPinjam modelpinjam;
    ViewPinjam viewpinjam;
    
     public ControllerPinjam(ModelPinjam mp, ViewPinjam vp) {
      this.modelpinjam = mp;
      this.viewpinjam = vp;
      
      vp.jbtambah.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             String ID = vp.getID();
             String Nama = vp.getNama();
             String IDBuku = vp.getIdBuku();
             String JudulBuku = vp.getJudul();
             
             mp.input(ID, Nama, IDBuku, JudulBuku);
           
          }
      });
     }

}
