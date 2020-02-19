package lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.dao;

import lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.entity.InstructorEagerVsLazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;

@Repository
public interface InstructorEagerVsLazyRepository extends JpaRepository< InstructorEagerVsLazy,Integer> {
}
