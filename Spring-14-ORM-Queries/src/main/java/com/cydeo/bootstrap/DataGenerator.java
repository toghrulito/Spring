package com.cydeo.bootstrap;

import com.cydeo.repository.CourseRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {


    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    private final EmployeeRepository employeeRepository;

    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository repository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = repository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("-------------------------- Region Start - Time-----------------------------------");
        System.out.println("findByCountry:" + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry:" + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryContaining:" + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByCountry:" + regionRepository.findByCountryContainingOrderByCountry("Asia"));
        System.out.println("findTopByCountry:" + regionRepository.findTop2ByCountry("Canada"));

        System.out.println("-------------------------- Region End - Time-----------------------------------");



        System.out.println("--------------------------Department Start - Time-----------------------------------");

        System.out.println("findByDepartment " + departmentRepository.findByDepartment("Computers"));
        System.out.println("findByDivisionIs " + departmentRepository.findByDepartment("Outdoors"));
        System.out.println(departmentRepository.findDistinctTopByDivisionContaining("Hea"));

        System.out.println("-------------------------- Department End - Time-----------------------------------");

        System.out.println("--------------------------Employee Start - Time-----------------------------------");

        //System.out.println(" findAllByEmail " + employeeRepository.findAllByEmail(""));
        //System.out.println(" findAllByEmail " + employeeRepository.findBySalaryIsGreaterThan(166000));
        System.out.println(" Details " + employeeRepository.getEmployeeDetail());
        System.out.println(" Details " + employeeRepository.getEmployeeSalary());





        System.out.println("-------------------------- EmployeeEnd - Time-----------------------------------");

        System.out.println("--------------------------Courses Start - Time-----------------------------------");

        courseRepository.findByCategory("Spring").forEach(System.out::println);

        System.out.println("---------------------------------------------------------------------------");

        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println(courseRepository.existsByName("Java script"));
        System.out.println("--------------------------Courses End- Time-----------------------------------");
        System.out.println("-----------------COURSE START-----------------");

        courseRepository.findByCategory("Spring").forEach(System.out::println);

        System.out.println("---------------------------");

        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);

        System.out.println("---------------------------");

        System.out.println(courseRepository.existsByName("JavaScript for All"));

        System.out.println("---------------------------");

        System.out.println(courseRepository.countByCategory("Spring"));

        System.out.println("---------------------------");

        courseRepository.findByNameStartsWith("Scalable").forEach(System.out::println);

        System.out.println("---------------------------");

        courseRepository.streamByCategory("Spring").forEach(System.out::println);



        System.out.println("-----------------COURSE  END-----------------");

    }
}
