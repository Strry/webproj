package com.dept.dao;

import com.dept.dto.DeptDTO;

import java.util.List;

public interface DeptMapper {
    List<DeptDTO> getAllDeptDTO();
    List<DeptDTO> serchDeptDtoByParam(DeptDTO deptdto);
    List<DeptDTO> foreachtest(List<String> hh);
}
