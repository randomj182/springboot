package com.random.domain;

import java.util.Date;

public class Sc {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc.stu_id
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    private String stuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc.course_id
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    private String courseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc.course_grade
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    private Double courseGrade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc.sc_time
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    private Date scTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sc.stu_id
     *
     * @return the value of sc.stu_id
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sc.stu_id
     *
     * @param stuId the value for sc.stu_id
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sc.course_id
     *
     * @return the value of sc.course_id
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sc.course_id
     *
     * @param courseId the value for sc.course_id
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sc.course_grade
     *
     * @return the value of sc.course_grade
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public Double getCourseGrade() {
        return courseGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sc.course_grade
     *
     * @param courseGrade the value for sc.course_grade
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public void setCourseGrade(Double courseGrade) {
        this.courseGrade = courseGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sc.sc_time
     *
     * @return the value of sc.sc_time
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public Date getScTime() {
        return scTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sc.sc_time
     *
     * @param scTime the value for sc.sc_time
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    public void setScTime(Date scTime) {
        this.scTime = scTime;
    }
}