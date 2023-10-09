package com.deperment.service.depermentdervice.serviceImpl;

import com.deperment.service.depermentdervice.entity.Department;
import com.deperment.service.depermentdervice.repository.DepartmentRepository;
import com.deperment.service.depermentdervice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        log.info("InsideService Department of DepartmentService");//this msg showing for console inside
       return departmentRepository.save(department);

    }



//    @Override
//    public Department saving(Department department) {
//       return departmentRepository.save(department);
//
//    }
//
    @Override
    public List<Department> getAll() {
       return departmentRepository.findAll();

    }

    @Override
    public Department findDepartmentById(Long departmentId) {
        log.info("InsideService Department of DepartmentService");//this msg showing for console inside


        return departmentRepository.findByDepartmentId(departmentId);
    }

}
