package test;

import com.dept.dto.DeptDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPtest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptDTO dept = ac.getBean("dept", DeptDTO.class);
        dept.AOPFuntiondemo1();
        try {
            dept.AOPFuntiondemo2("hhh",1);
        } catch (Exception e) {

        }
        dept.AOPFuntiondemo3();
    }
}
