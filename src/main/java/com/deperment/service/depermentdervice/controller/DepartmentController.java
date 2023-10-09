package com.deperment.service.depermentdervice.controller;

import com.deperment.service.depermentdervice.entity.Department;
import com.deperment.service.depermentdervice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/department")
@Slf4j
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;


//    @PostMapping              //this is also working but this normal method
//    public String saving(@RequestBody Department department){
//        departmentService.saving(department);
//       return "the Department Data be saved ";
//
//    }
//
    @GetMapping
    public List<Department> getAll(){
       return departmentService.getAll();
    }

    @PostMapping        //this method should be used log because msg should show console inside.
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController"); //this msg showing for console inside
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
       log.info("Inside findDepartmentById method of DepartmentOfController");
    return departmentService.findDepartmentById(departmentId);
    }

}
