package cyou.lositha.springehcacheexample.hibernate.oneToOneBiDeleteInstructorDetailOnly.dao;

import cyou.lositha.springehcacheexample.hibernate.oneToOneBiDeleteInstructorDetailOnly.entity.InstructorDetailOneToOneBiDeleteInstructorDetailOnly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository
        extends JpaRepository<InstructorDetailOneToOneBiDeleteInstructorDetailOnly, Integer> {
}
