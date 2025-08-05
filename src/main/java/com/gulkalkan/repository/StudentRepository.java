package com.gulkalkan.repository;

import com.gulkalkan.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    //HQL :sınıfın ismi ve değişken isimleri kullanılarak sorgu yazılır
    //SQL : veritabanı tablolarının isimleri ve sütun isimleri kullanılarak sorgu yazılır
/*
    //SQL örneği
    @Query(value = "select * from student.student ", nativeQuery = true)
    List<Student> findAllStudents();
    //HQL örneği

    @Query(value = "from Student", nativeQuery = false)
    List<Student> findAllStudents  ();

     */

    @Query(value = "from Student",nativeQuery = false)

    List<Student> findAllStudents();

    @Query(value = "from Student s where s.id= : sttudentId")
   Optional<Student>  findStudentById(Integer studentId);


}
