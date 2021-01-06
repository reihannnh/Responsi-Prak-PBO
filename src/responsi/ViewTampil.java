package responsi;

import java.awt.Color;
import java.awt.ScrollPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ViewTampil extends JFrame{
    
    JButton jblogout = new JButton("Logout");
    
    JLabel jlperpus = new JLabel("PERPUSTAKAAN");
    
    JButton jbhome = new JButton("Home");
    JButton jbpinjam = new JButton("Pinjam");
    JButton jbtampil = new JButton("Tampil");
    JButton jbaboutus = new JButton("About Us");
    
    JButton jbhapus = new JButton("Hapus");
    JButton jbedit = new JButton("Edit");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID", "Nama", "ID Buku", "Judul"};
    
    public ViewTampil(){      
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(700,600);
        getContentPane().setBackground(Color.YELLOW);
        
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        // setBounds(m,n,o,p)
	// m = posisi x; n = posisi y
	// o = panjang komponen; p = tinggi komponen
        
        //Logout
        add(jblogout);
        jblogout.setBounds(560,20, 100, 40);
        jblogout.setBackground(Color.RED);
        //Perpustakaan
        add(jlperpus);
        jlperpus.setBounds(180,40,100,20);

        //Hapus
        add(jbhapus);
        jbhapus.setBounds(120, 100, 100, 20);
        //Edit
        add(jbedit);
        jbedit.setBounds(240, 100, 100, 20);
        
        //Tabel
        add(scrollPane);
        scrollPane.setBounds(20, 160, 480, 300);
        
        //Home
        add(jbhome);
        jbhome.setBounds(560, 240, 100, 40);
        //Pinjam
        add(jbpinjam);
        jbpinjam.setBounds(560, 290, 100, 40);
        //Pinjam
        add(jbtampil);
        jbtampil.setBounds(560, 340, 100, 40);
        //About Us
        add(jbaboutus);
        jbaboutus.setBounds(560, 390, 100, 40);

        
    }
}
