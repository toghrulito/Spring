package com.cydeo.bootstrap;

import com.cydeo.entity.Employee;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {


    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    private final EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository repository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = repository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
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
        System.out.println(" findAllByEmail " + employeeRepository.findBySalaryIsGreaterThan(166000));

        System.out.println("-------------------------- Department End - Time-----------------------------------");

    }
}
