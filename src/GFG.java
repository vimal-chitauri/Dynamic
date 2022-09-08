import com.sun.deploy.security.ruleset.RuleSetParser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GFG {
    public static void main(String[] args) throws ParseException {
        String date_s = "20220725021412";
        SimpleDateFormat dt = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = dt.parse(date_s);
        System.out.println(date+"=====");
        String dbCheckdate = new SimpleDateFormat("dd/MM/yyyy").format(date)+"-23:59:59";
        System.out.println(dbCheckdate);



    }
}
