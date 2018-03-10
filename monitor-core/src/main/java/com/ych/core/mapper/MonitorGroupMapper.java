package com.ych.core.mapper;

import com.ych.core.model.MonitorGroup;
import com.ych.core.model.MonitorGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MonitorGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    long countByExample(MonitorGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    int deleteByExample(MonitorGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    int insert(MonitorGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    int insertSelective(MonitorGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    List<MonitorGroup> selectByExampleWithRowbounds(MonitorGroupExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    List<MonitorGroup> selectByExample(MonitorGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    MonitorGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MonitorGroup record, @Param("example") MonitorGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MonitorGroup record, @Param("example") MonitorGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MonitorGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MonitorGroup record);
}