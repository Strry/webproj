package com.emp.dto;

import com.dept.dto.DeptDTO;

import java.util.Date;
import java.util.List;

public class EmpDTO {
    private String empno;
    private String ename;
    private String job;
    private String mgr;
    private Date   hiredate;
    private double sal;
    private double comm;
    private double deptno;
    private DeptDTO deptdto;
    private List<DeptDTO> deptlist;

    @Override
    public String toString() {
        return "EmpDTO{" +
                "empno='" + empno + '\'' +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr='" + mgr + '\'' +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                ", deptdto=" + deptdto +
                ", deptlist=" + deptlist +
                "}\n";
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMgr() {
        return mgr;
    }

    public void setMgr(String mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public double getDeptno() {
        return deptno;
    }

    public void setDeptno(double deptno) {
        this.deptno = deptno;
    }

    public DeptDTO getDeptdto() {
        return deptdto;
    }

    public void setDeptdto(DeptDTO deptdto) {
        this.deptdto = deptdto;
    }

    public List<DeptDTO> getDeptlist() {
        return deptlist;
    }

    public void setDeptlist(List<DeptDTO> deptlist) {
        this.deptlist = deptlist;
    }
}
