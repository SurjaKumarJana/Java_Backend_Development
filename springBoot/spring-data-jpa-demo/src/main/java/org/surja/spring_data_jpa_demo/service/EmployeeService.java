package org.surja.spring_data_jpa_demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.surja.spring_data_jpa_demo.dao.BranchRepo;
import org.surja.spring_data_jpa_demo.dao.EmployeeRepo;
import org.surja.spring_data_jpa_demo.dto.EmployeeDetailReqDto;
import org.surja.spring_data_jpa_demo.entity.Address;
import org.surja.spring_data_jpa_demo.entity.Branch;
import org.surja.spring_data_jpa_demo.entity.Employee;
import org.surja.spring_data_jpa_demo.exception.AdhaarValidationFailedException;
import org.surja.spring_data_jpa_demo.exception.LaptopAllocationFailedException;

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

    /*  The benifit of adding @Transactional:
    in normal case if the trasaction failed , we will still found that the data is stored in the database
    but, now if the  transaction failed , then the data will not be stored in db

    by default this annotaion doesn't rollback for every annotation , so we should add this manually.
     */
    @Transactional(rollbackFor = AdhaarValidationFailedException.class)
    public Long create(EmployeeDetailReqDto employeeDetailReq) throws AdhaarValidationFailedException, LaptopAllocationFailedException {

        //in application it will make a call to Adhaar API Service to check it
        boolean isAdhaarVerified = false;
        boolean isLaptopAllocated = true;

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

        /*
        after execution the above line , the entity goes into manage stage
        now every changes will be monitored
        after completion of this transaction those changes also be stored in db
         */
        if (!isAdhaarVerified) {
            throw new AdhaarValidationFailedException("Adhaar validation failed !");

        }
        if (!isLaptopAllocated) {
            throw new LaptopAllocationFailedException("Laptop allocation failed !");

        }


        return employee.getId();

    }

    public Employee findByEmail(String email){
        return employeeRepo.findByEmail(email);
    }
}