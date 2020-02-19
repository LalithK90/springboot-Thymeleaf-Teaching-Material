package lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.dao;

import lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.entity.CourseEagerVsLazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEagerVsLazyRepository extends JpaRepository< CourseEagerVsLazy, Integer > {
}
