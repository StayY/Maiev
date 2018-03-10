package com.ych.core.mapper;

import com.ych.core.model.MonitorProjectUrl;
import com.ych.core.model.MonitorProjectUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MonitorProjectUrlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    long countByExample(MonitorProjectUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    int deleteByExample(MonitorProjectUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    int insert(MonitorProjectUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    int insertSelective(MonitorProjectUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    List<MonitorProjectUrl> selectByExampleWithRowbounds(MonitorProjectUrlExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    List<MonitorProjectUrl> selectByExample(MonitorProjectUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    MonitorProjectUrl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MonitorProjectUrl record, @Param("example") MonitorProjectUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MonitorProjectUrl record, @Param("example") MonitorProjectUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MonitorProjectUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_project_url
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MonitorProjectUrl record);
}