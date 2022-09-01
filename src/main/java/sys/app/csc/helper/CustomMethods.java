package sys.app.csc.helper;

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
	
	public Long getDayDifference(String startdate, String todate) {
		return null;
	}; 

}
