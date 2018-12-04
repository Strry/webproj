package com.emp.dao;

import com.dept.dto.DeptDTO;
import com.emp.dto.EmpDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDAO {
    List<EmpDTO> getAllEmp();
    List<EmpDTO> searchEmpByDeptNo(@Param("deptno") String deptno);
    List<EmpDTO> searchByParam(EmpDTO dto);
    DeptDTO getOneDeptDto(String str);
    List<DeptDTO> getDeptDtoList(String str);
}
