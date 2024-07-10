package com.firstproject.springboot.repositories;

import com.firstproject.springboot.dto.PspAndBrand;
import com.firstproject.springboot.dto.PspAndName;
import com.firstproject.springboot.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query(value = "select id,psp,name from student", nativeQuery = true)
    List<Student> findAllStudentDetails();

    @Query(value = "select psp,name from student", nativeQuery = true)
    List<PspAndName> findStudentPspAndName();

    @Query(value = "select s.psp as psp,l.brand as brand from Student s join " +
            "Laptop l ON s.id=l.st_id ",
            nativeQuery = true)
    List<PspAndBrand> findStudentPspAndBrand();
}
