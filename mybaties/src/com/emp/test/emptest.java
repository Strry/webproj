package com.emp.test;

import com.emp.dao.EmpDAO;
import com.emp.dto.EmpDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class emptest {
    public static void main(String[] args) {
        try {
            InputStream is = Resources.getResourceAsStream("mybaties-cfg.xml");
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = sf.openSession();

            EmpDAO empdao = session.getMapper(EmpDAO.class);
            List<EmpDTO> list = empdao.getAllEmp();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
