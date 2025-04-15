import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

  public static void main(String[] args) {
    List<Production> productions = new ArrayList<Production>();
    try{
      Connection conn = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/antino", "root", "123456");
      PreparedStatement stmt = conn.prepareStatement("select * from production");
      ResultSet rs = stmt.executeQuery("select * from production");
      while (rs.next()) {
        Integer id = rs.getInt("id");
        String name = rs.getString("name");
        Float price = rs.getFloat("price");
        String description = rs.getString("description");
        Integer total = rs.getInt("total");
        Production production = new Production(id, name, description, price, total);
        productions.add(production);

      }
      System.out.println("Thành công");
      conn.close();
    }catch (Exception e){
      System.out.println(e);
    }

    for (Production x : productions){
      System.out.println(x);
    }
  }
}
