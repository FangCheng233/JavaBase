package com.fc.base.jdbc.hibernate.en;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/16 10:04 下午
 * @Version 1.0
 */
public class Employee {
    private Integer eid;
    private String ename;
    private String esex;
    private Department department;

    /**
     * Gets the value of eid. *
     *
     * @return the value of eid
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * Sets the eid. *
     * <p>You can use getEid() to get the value of eid</p>
     * * @param eid eid
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * Gets the value of ename. *
     *
     * @return the value of ename
     */
    public String getEname() {
        return ename;
    }

    /**
     * Sets the ename. *
     * <p>You can use getEname() to get the value of ename</p>
     * * @param ename ename
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * Gets the value of esex. *
     *
     * @return the value of esex
     */
    public String getEsex() {
        return esex;
    }

    /**
     * Sets the esex. *
     * <p>You can use getEsex() to get the value of esex</p>
     * * @param esex esex
     */
    public void setEsex(String esex) {
        this.esex = esex;
    }

    /**
     * Gets the value of department. *
     *
     * @return the value of department
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the department. *
     * <p>You can use getDepartment() to get the value of department</p>
     * * @param department department
     */
    public void setDepartment(Department department) {
        this.department = department;
    }
}
