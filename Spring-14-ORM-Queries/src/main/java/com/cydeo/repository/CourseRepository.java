package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

    //find all courses by category
   List<Course> findByCategory(String category);

   // find all courses by category and order the entities by name

   List<Course>findByCategoryOrderByName(String categories);

   //checks if a course with the provided name exists. return true if the course exists, false otherwise

    boolean existsByName(String name);


    //returns the count of courses for the provided category
    int countByCategory(String category);

    //find all courses that start with the provided course name

    List<Course> findByNameStartsWith(String name);

    //find all courses by category and returns a stream
    Stream<Course> streamByCategory(String name);

    @Query("SELECT c FROM Course c WHERE c.category = :category AND c.rating > :rating")
    List<Course> findAllByCategoryAndRatingGreaterThan(@Param("category") String category, @Param("rating") int rating);



}
