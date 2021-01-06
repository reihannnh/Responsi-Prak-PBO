package responsi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelTampil extends ModelResponsi{
     public int getBanyakData(){
        int jmlData = 0;
        try{
                 statement = (Statement) koneksi.createStatement();

            String query = "Select * from transactions";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    public String[][] readTransactions(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][4]; //baris, kolom nya ada 4
            
            String query = "Select * from transactions"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("MemberId"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("MemberName");                
                data[jmlData][2] = resultSet.getString("BookID");
                data[jmlData][3] = resultSet.getString("BookName");
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
}
