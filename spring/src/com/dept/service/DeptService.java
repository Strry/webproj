package com.dept.service;

import com.dept.dao.DeptMapper;
import com.dept.dto.DeptDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DeptService {
    private DeptMapper depemapper;

    public DeptMapper getDepemapper() {
        return depemapper;
    }

    public void setDepemapper(DeptMapper depemapper) {
        this.depemapper = depemapper;
    }

    public List<DeptDTO> getAllDeptDTO(){
        return depemapper.getAllDeptDTO();
    }
}
