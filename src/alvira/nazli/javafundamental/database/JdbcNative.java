package alvira.nazli.javafundamental.database;

import java.sql.*;

public class JdbcNative {
    Connection connection = null;

    public void database(){
      try{
          // configure driver
          Class.forName("com.mysql.jdbc.Driver");

          // setup database
          String hostname = "localhost";
          String dbname = "import";
          String username = "root";
          String password = "";

          // connect to db
          // link url : jdbc:mysql://hostname/dbname
          this.connection = DriverManager.getConnection("jdbc:mysql://" + hostname + "/" + dbname, username, password);
          System.out.println("Database Connected!");

          // select data
          String selectQuery = "SELECT * FROM tbl_position";

          // statement
          Statement statement = connection.createStatement();
          ResultSet resultSet = statement.executeQuery(selectQuery);
          //System.out.println(resultSet);

          while (resultSet.next()){
              int id_pos = resultSet.getInt("id_pos");
              String positionCode = resultSet.getString("positionCode");
              String positionName = resultSet.getString("positionName");
              int id_org = resultSet.getInt("id_org");

              System.out.println(id_pos + "\t" + positionCode + "\t" + positionName + "\t" + id_org);
          }

          // select with condition
          String query = "SELECT * FROM tbl_position WHERE positionCode = ?";

          // prepared statement
          PreparedStatement preparedStatement = connection.prepareStatement(query);
          preparedStatement.setString(1, "FINMGR");

          ResultSet resultSet1 = preparedStatement.executeQuery();

          System.out.println("\nSelect data where position code = FINMGR");
          while (resultSet1.next()){
              Integer id_pos = resultSet1.getInt("id_pos");
              String positionCode = resultSet1.getString("positionCode");
              String positionName = resultSet1.getString("positionName");
              int id_org = resultSet1.getInt("id_org");
              System.out.println(id_pos + "\t" + positionCode + "\t" + positionName + "\t" + id_org);
          }

//          // insert data
//          String insert = "INSERT INTO tbl_position (positionCode, positionName, id_org) values (?, ?, ?)";
//
//          // prepared statement
//          preparedStatement = connection.prepareStatement(insert);
//          preparedStatement.setString(1, "ABC");
//          preparedStatement.setString(2, "Posisi ABC");
//          preparedStatement.setInt(3, 78);
//
//          Integer result = preparedStatement.executeUpdate();
//          System.out.println("affected rows : " + result);
//
//          if(result>0){
//              System.out.println("Data Inserted!");
//          }
//          else{
//              System.out.println("Failed insert data");
//          }

//          // update data
//          String updateQuery = "UPDATE tbl_position SET positionCode = ?, positionName = ? WHERE id_pos = ?";
//          preparedStatement = connection.prepareStatement(updateQuery);
//          preparedStatement.setString(1, "BSDD");
//          preparedStatement.setString(2, "Posisi BCD");
//          preparedStatement.setInt(3, 33);
//
//          Integer result2 = preparedStatement.executeUpdate();
//          System.out.println("affected rows : " + result2);
//
//          if(result2>0){
//              System.out.println("Data Updated!");
//          }
//          else{
//              System.out.println("Failed update data");
//          }

//          // delete data
//          String deleteQuery = "DELETE FROM tbl_position WHERE id_pos = ?";
//          preparedStatement = connection.prepareStatement(deleteQuery);
//          preparedStatement.setInt(1, 33);
//
//          Integer result3 = preparedStatement.executeUpdate();
//          System.out.println("affected rows : " + result3);
//
//          if(result3>0){
//              System.out.println("Data Deleted!");
//          }
//          else{
//              System.out.println("Failed delete data");
//          }

      }catch (Exception e){
          System.out.println("Error database don't connect : " + e);
      }


    }


    public static void main(String[] args) {
        JdbcNative jdbcNative = new JdbcNative();
        jdbcNative.database();
    }
}
