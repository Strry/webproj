package com.dept.dto;

public class DeptDTO {
    private String deptNo;
    private String dName;
    private String loc;

    public DeptDTO() {

    }

    public DeptDTO(String deptNo, String dName, String loc) {
        this.deptNo = deptNo;
        this.dName = dName;
        this.loc = loc;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "DeptDTO{" +
                "deptNo='" + deptNo + '\'' +
                ", dName='" + dName + '\'' +
                ", loc='" + loc + '\'' +
                "}\n";
    }

    public void AOPFuntiondemo1(){
        System.out.println("AOPFuntiondemo1");
    }
    public void AOPFuntiondemo2(String str,int i){
        /*int k=5/0;*/
        System.out.println("AOPFuntiondemo2：str"+str+" i:"+i);
    }
    public void AOPFuntiondemo3(){
        System.out.println("AOPFuntiondemo3");
    }

}
