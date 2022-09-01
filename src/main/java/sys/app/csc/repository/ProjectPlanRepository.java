package sys.app.csc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sys.app.csc.entity.ProjectPlanEntity;

@Repository
public interface ProjectPlanRepository extends JpaRepository<ProjectPlanEntity, Integer> {

}
