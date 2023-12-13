package cyou.lositha.springehcacheexample.hibernate.oneToOneBiDeleteInstructorDetailOnly.dao;

import cyou.lositha.springehcacheexample.hibernate.oneToOneBiDeleteInstructorDetailOnly.entity.InstructorOneToOneBiDeleteInstructorDetailOnly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorOneToOneBiDeleteInstructorDetailOnlyRepository
        extends JpaRepository<InstructorOneToOneBiDeleteInstructorDetailOnly, Integer> {
}
