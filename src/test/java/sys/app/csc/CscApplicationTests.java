package sys.app.csc;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;


class CscApplicationTests {

	@Test
	void contextLoads() {
		LocalDateTime now = LocalDateTime.now();
		Timestamp timestamp = Timestamp.valueOf(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Integer duration = 3;
		
		Timestamp later = new Timestamp(timestamp.getTime() + (1000 * 60 * 60 * duration));
		
		System.out.println("Duration: "+ duration);
		System.out.println("Start Date: "+ sdf.format(timestamp));
		System.out.println("End Date: "+ sdf.format(later));
		
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime nextdateTime = LocalDateTime.parse(sdf.format(later), formatter);
		
		Timestamp timestamp2 = Timestamp.valueOf(nextdateTime);
		Integer duration2 = 5;
		Timestamp later2 = new Timestamp(timestamp2.getTime() + (1000 * 60 * 60 * duration2));
		System.out.println("------------------------------------------------------------------");
		System.out.println("Duration: "+ duration2);
		System.out.println("Start Date: "+ sdf.format(timestamp2));
		System.out.println("End Date: "+ sdf.format(later2));
	}

}
