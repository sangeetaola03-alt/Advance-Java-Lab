import java.sql.*;

public class JDBC {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "mysql@123"
            );

            System.out.println("Database Connected Successfully!");

            PreparedStatement ps = con.prepareStatement(
                "insert into student values(?,?,?)"
            );

            ps.setInt(1, 1);
            ps.setString(2, "Sangeeta");
            ps.setString(3, "CSE");

            ps.executeUpdate();

            System.out.println("Data Inserted Successfully!");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from student");

            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3)
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}