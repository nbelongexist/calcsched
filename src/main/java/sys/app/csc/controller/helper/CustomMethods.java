package sys.app.csc.controller.helper;

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
	
	public Long getDayDifference(String startdate, String todate) {
		return null;
	}; 

}
