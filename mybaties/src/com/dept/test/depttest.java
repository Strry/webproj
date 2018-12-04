package com.dept.test;

import com.dept.dao.DeptMapper;
import com.dept.dto.DeptDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class depttest {
    public static void main(String[] args) {
        try {
            InputStream is = Resources.getResourceAsStream("mybaties-cfg.xml");
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = sf.openSession();

            DeptMapper deptmapper = session.getMapper(DeptMapper.class);
            List<String> strlist = new ArrayList<>();
            strlist.add("10");
            strlist.add("23");
            strlist.add("80");
            List<DeptDTO> list = deptmapper.foreachtest(strlist);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
