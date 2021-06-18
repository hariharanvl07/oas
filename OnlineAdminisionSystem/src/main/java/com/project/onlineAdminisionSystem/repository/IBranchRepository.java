package com.project.onlineAdminisionSystem.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.Branch;


@Repository
public interface IBranchRepository extends JpaRepository<Branch , Integer>
{



	void deleteBybranchName(String branchName);

	Branch findBybranchName(String branchName);
	@Query(value="select * from branch where course_id= :id ;",nativeQuery=true)
	List<Branch> findBranchByCourseId(@Param("id") int courseId);
	

}
