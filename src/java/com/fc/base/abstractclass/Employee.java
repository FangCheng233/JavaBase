package com.fc.base.abstractclass;

import java.time.LocalDate;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/6/24 7:45 上午
 * @Version 1.0
 */
public class Employee extends Person {
    /**
     * @Description
     * @Author fangcheng
     * @Date 2020/6/24 9:46 上午
     */
    private double salary;
    /**
      * @Description
      * @Author fangcheng
      * @Date 2020/6/24 9:47 上午
      */
    private LocalDate localDate;

    /**
     * Gets the value of salary. *
     *
     * @return the value of salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary. *
     * <p>You can use getSalary() to get the value of salary</p>
     * * @param salary salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Gets the value of localDate. *
     *
     * @return the value of localDate
     */
    public LocalDate getLocalDate() {
        return localDate;
    }

    /**
     * Sets the localDate. *
     * <p>You can use getLocalDate() to get the value of localDate</p>
     * * @param localDate localDate
     */
    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
