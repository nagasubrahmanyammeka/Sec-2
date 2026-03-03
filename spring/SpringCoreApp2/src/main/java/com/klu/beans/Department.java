package com.klu.beans;

public class Department {
    private int deptid;
    private String deptname;

    // Constructor for Spring injection
    public Department(int deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    public int getDeptid() {
        return deptid;
    }

    public String getDeptname() {
        return deptname;
    }
}