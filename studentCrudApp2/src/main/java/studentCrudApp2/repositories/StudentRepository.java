package studentCrudApp2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import studentCrudApp2.entities.Student;

public interface StudentRepository 
							extends JpaRepository<Student, String> {
	
	Student findByKodId(String kodId);

}
