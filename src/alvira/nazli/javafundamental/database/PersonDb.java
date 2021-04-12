package alvira.nazli.javafundamental.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PersonDb {

    Connection connection = null;

    private String firstName;
    private String lastName;

    Scanner in = new Scanner(System.in);

    public void database(){
        try{
            Class.forName("com.mysql.jdbc.Driver");

            //setup database
            String hostname = "localhost";
            String dbname = "import";
            String username = "root";
            String password = "";

            // connect to db
            // link url : jdbc:mysql://hostname/dbname
            this.connection = DriverManager.getConnection("jdbc:mysql://" + hostname + "/" + dbname, username, password);
            System.out.println("Database Connected!");

            // query syntax

            String insert = "INSERT INTO person(first_name, last_name) values (? , ?)";
            String select = "SELECT * FROM person";

            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            System.out.println("Nama depan : ");
            firstName = in.next();
            System.out.println("Nama Belakang : ");
            lastName = in.next();
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);

            // result
            int rows = preparedStatement.executeUpdate();
            if (rows > 0){
                System.out.println("Data person inserted!");
            }

            preparedStatement = connection.prepareStatement(select);
            ResultSet result = preparedStatement.executeQuery();
            while(result.next()){
                System.out.println(result.getInt("id") + "\t" + result.getString("first_name") + "\t" + result.getString("last_name"));
            }


        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
