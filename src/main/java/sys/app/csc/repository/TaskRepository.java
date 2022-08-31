package sys.app.csc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sys.app.csc.entity.TaskEntity;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

}
