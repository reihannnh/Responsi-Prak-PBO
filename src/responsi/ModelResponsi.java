package responsi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ModelResponsi {
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
     static final String DB_URL = "jdbc:mysql://localhost/responsi_perpus";
     static final String USER = "root";
     static final String PASS = "";
     Connection koneksi;
     Statement statement;
     
    
    public ModelResponsi(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }
           catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    
    
    public boolean login(String user,String pwd){
        boolean cek=false;
        try
           {
          
              int jmlData=0;
               String query = "select * from accounts where username='"+user+"' and password ='"+pwd+"'";
                statement = (Statement) koneksi.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
               
                
               while (resultSet.next())
           { 
                jmlData++;
            }
                if(jmlData!=0)
                { System.out.println("Login Sukses");
                  cek=true;
                }
                else
                {
                    System.out.println("Login Gagal");
                    cek=false;
                    
                }
                    
             }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
         
        return cek;
    }
    
    public boolean daftar(String user,String pwd)
    {
        try
        {
             String query = "insert into accounts (Username,Password) VALUES ('"+user+"','"+pwd+"')";
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query);
                
             return true;
        }
        
        catch(SQLException ex)
        {
          if(ex.getErrorCode() == 1062 )
          {
            System.out.println(ex.getMessage());
            return false;
         }
       
        }
      return true;
    }  
    
    
    
    
    
}
