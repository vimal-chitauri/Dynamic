import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateTimeInsert_MYSQL {
    private final static String INSERT_CUSTOMER_QUERY =
            "INSERT INTO CUSTOMER_INFO(CNAME,BILLAMT,DOB,TOP,ORDER_DATE_TIME) VALUES(?,?,?,?,?)";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             Connection Con = DriverManager.getConnection("jdbc:mysql:///advjava", "root", "root");
             PreparedStatement ps = Con.prepareStatement(INSERT_CUSTOMER_QUERY);) {
            String name=null, sdob=null, stop=null, sorderdt=null;
            float billamt=0.0f;
            if(sc!=null) {
                // read input value
                System.out.println("Enter Customer Name:");
                name = sc.next();
                System.out.println("Enter Bill Amount::");
                billamt = sc.nextFloat();
                System.out.println("Enter DOB(dd-mm-yyyy)::");
                sdob = sc.next();
                System.out.println("Enter TOP(hh:mm:ss)::");
                stop = sc.next();
                System.out.println("Enter order date time(dd/MM/yyyy hh:mm:ss)::");
                sorderdt = sc.next();
            }
            //convert String DOB to java.sql.Date class object
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date udob=sdf.parse(sdob); //String to util date
            java.sql.Date sqdob= new java.sql.Date(udob.getTime()); //util to SQL

            //convert String TOP to java.sql.Time class object
            java.sql.Time sqtop=java.sql.Time.valueOf(stop);

            //convert String Order date, time to java.sql.Timestamp object
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            java.util.Date uorderdt=sdf1.parse(sorderdt);
            java.sql.Timestamp sqorderdt=new java.sql.Timestamp(uorderdt.getTime());


            if(ps!=null) {
                // set value SQL query paraM
                ps.setString(1, name);
                ps.setFloat(2, billamt);
                ps.setDate(3, sqdob);
                ps.setTime(4, sqtop);
                ps.setTimestamp(5, sqorderdt);
                //execute query
                int result=ps.executeUpdate();
                if(result==0)
                    System.out.println("Customer details not inserted..!");
                else
                    System.out.println("Customer details inserted..!");
            }
        } // try
        catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }// main
}