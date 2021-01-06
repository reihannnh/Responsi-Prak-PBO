package responsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static responsi.ModelResponsi.DB_URL;
import static responsi.ModelResponsi.JDBC_DRIVER;
import static responsi.ModelResponsi.PASS;
import static responsi.ModelResponsi.USER;

public class ModelPinjam extends ModelResponsi {
    
     
     public void input(String ID,String Nama,String IDBuku,String JudulBuku)
     {
         try
         {
             String query = "insert into transactions (MemberId,MemberName,BookId,BookName) Values "
                           +"('"+ID+"','"+Nama+"','"+IDBuku+"','"+JudulBuku+"')";
              statement = (Statement) koneksi.createStatement();
              statement.executeUpdate(query);
         }
         
         catch(SQLException e)
         {
             System.out.println(e.getMessage());
         }
        
     }
     
     public void edit(String ID,String Nama,String IDBuku,String JudulBuku)
     {
        
     }
}
