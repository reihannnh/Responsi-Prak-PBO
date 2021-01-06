package responsi;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControllerTampil extends JFrame {
     ModelTampil mt;
     ViewTampil vt;
     
     public ControllerTampil(ModelTampil modt,ViewTampil viewT)
     {
         this.mt = modt;
         this.vt = viewT;
         if (mt.getBanyakData() != 0) {
            String dataMahasiswa[][] = mt.readTransactions();
            vt.tabel.setModel((new JTable(dataMahasiswa, vt.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
     }
}
