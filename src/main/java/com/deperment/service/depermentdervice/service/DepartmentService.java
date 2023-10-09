package com.deperment.service.depermentdervice.service;

import com.deperment.service.depermentdervice.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);


// Department saving(Department department);

    List<Department> getAll();

    Department findDepartmentById(Long departmentId);
}
