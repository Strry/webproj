package com.dept.service;

import com.dept.dao.DeptMapper;
import com.dept.dto.DeptDTO;
import org.apache.ibatis.session.SqlSession;
import util.mybaties.MybatiesUtil;

import java.util.List;

public class DeptService {
    public List<DeptDTO> selectAllDeptDto(){
        SqlSession session = MybatiesUtil.getSession();
        DeptMapper deptmapper= session.getMapper(DeptMapper.class);
        List<DeptDTO> list = deptmapper.getAllDeptDTO();
        return list;
    }

    public List<DeptDTO> selectAllDeptDtoByParam(DeptDTO deptdto){
        SqlSession session = MybatiesUtil.getSession();
        DeptMapper deptmapper= session.getMapper(DeptMapper.class);
        List<DeptDTO> list = deptmapper.serchDeptDtoByParam(deptdto);
        return list;
    }
}
