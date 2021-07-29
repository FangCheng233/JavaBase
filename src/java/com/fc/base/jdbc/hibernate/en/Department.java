package com.fc.base.jdbc.hibernate.en;

/**
 * @ClassName Department
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/16 10:03 下午
 * @Version 1.0
 */
public class Department {
    private Integer did;
    private String departname;
    //get和set方法，这里就不贴出来了，自己引入即可

    /**
     * Gets the value of did. *
     *
     * @return the value of did
     */
    public Integer getDid() {
        return did;
    }

    /**
     * Sets the did. *
     * <p>You can use getDid() to get the value of did</p>
     * * @param did did
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * Gets the value of departname. *
     *
     * @return the value of departname
     */
    public String getDepartname() {
        return departname;
    }

    /**
     * Sets the departname. *
     * <p>You can use getDepartname() to get the value of departname</p>
     * * @param departname departname
     */
    public void setDepartname(String departname) {
        this.departname = departname;
    }
}
