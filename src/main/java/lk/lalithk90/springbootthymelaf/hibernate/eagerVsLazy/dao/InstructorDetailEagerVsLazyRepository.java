package lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.dao;

import lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.entity.InstructorDetailEagerVsLazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailEagerVsLazyRepository extends JpaRepository< InstructorDetailEagerVsLazy,Integer> {
}
