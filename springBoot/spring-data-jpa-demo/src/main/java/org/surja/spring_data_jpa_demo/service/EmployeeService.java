package org.surja.spring_data_jpa_demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.surja.spring_data_jpa_demo.dao.BranchRepo;
import org.surja.spring_data_jpa_demo.dao.EmployeeRepo;
import org.surja.spring_data_jpa_demo.dto.EmployeeDetailReqDto;
import org.surja.spring_data_jpa_demo.entity.Address;
import org.surja.spring_data_jpa_demo.entity.Branch;
import org.surja.spring_data_jpa_demo.entity.Employee;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private BranchRepo branchRepo;


    public Employee findById(Long id){
        return employeeRepo.findById(id).get();
    }

    public List<Employee> getAll(){
        return employeeRepo.findAll();
    }

    public Long create(EmployeeDetailReqDto employeeDetailReq){

        Branch branch = branchRepo.findById(employeeDetailReq.getBranchId()).get();

        Address address = new Address();
        address.setLine1(employeeDetailReq.getLine1());
        address.setLine2(employeeDetailReq.getLine2());
        address.setCity(employeeDetailReq.getCity());

        Employee employee = new Employee();
        employee.setName(employeeDetailReq.getName());
        employee.setEmail(employeeDetailReq.getEmail());
        employee.setBranch(branch);
        employee.setAddress(address);

        employeeRepo.save(employee);
        return employee.getId();

    }

    public Employee findByEmail(String email){
        return employeeRepo.findByEmail(email);
    }
}