import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Time {
  public static void main(String[] args) throws ParseException {
//    String str = "Jun 13 2003 23:11:52.454 UTC";
//    SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");
//    Date date = df.parse(str);
//    long epoch = date.getTime();
//    System.out.println(epoch);
    long now = Instant.now().toEpochMilli();
    System.out.println(now);
    System.out.println("yaro");
  }
}
