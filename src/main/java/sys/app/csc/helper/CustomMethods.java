package sys.app.csc.helper;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CustomMethods {
	
	public <S, T> List<T> mapList(List<S> source, Class<T> target){
		ModelMapper modelmapper = new ModelMapper();
		return source.stream().map(element -> modelmapper.map(element, target)).collect(Collectors.toList());
	}
	
	public <S, T> T mapObj(S source, Class<T> target){
		ModelMapper modelmapper = new ModelMapper();
		return modelmapper.map(source, target);
	}
	
	public String getEndDate(String startdate, Integer duration) {
		
		System.out.println("Date: "+startdate+" ||"+duration);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * LocalDateTime now = LocalDateTime.now(); Timestamp timestamp =
		 * Timestamp.valueOf(now);
		 */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime startdatetime = LocalDateTime.parse(startdate, formatter);		
		Timestamp timestamp = Timestamp.valueOf(startdatetime);		
		Timestamp endtimestamp = new Timestamp(timestamp.getTime() + (1000 * 60 * 60 * duration));		
		return sdf.format(endtimestamp);
	}; 

}
