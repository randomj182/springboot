package com.random.domain;

public class Student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.stu_id
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    private String stuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.stu_name
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    private String stuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sex
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    private Integer sex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.stu_id
     *
     * @return the value of student.stu_id
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.stu_id
     *
     * @param stuId the value for student.stu_id
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.stu_name
     *
     * @return the value of student.stu_name
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.stu_name
     *
     * @param stuName the value for student.stu_name
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sex
     *
     * @return the value of student.sex
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sex
     *
     * @param sex the value for student.sex
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }
}