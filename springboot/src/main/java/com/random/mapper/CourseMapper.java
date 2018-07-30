package com.random.mapper;

import com.random.domain.Course;
import java.util.List;

public interface CourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    int deleteByPrimaryKey(String courseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    int insert(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    Course selectByPrimaryKey(String courseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    List<Course> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Tue Jul 24 17:42:07 CST 2018
     */
    int updateByPrimaryKey(Course record);
}