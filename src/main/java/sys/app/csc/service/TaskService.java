package sys.app.csc.service;

import sys.app.csc.model.dto.TaskDto;

public interface TaskService {
	TaskDto save(TaskDto dto, Integer planid);
}
