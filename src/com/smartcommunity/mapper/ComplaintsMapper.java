package com.smartcommunity.mapper;

import com.smartcommunity.pojo.Complaints;
import com.smartcommunity.pojo.ComplaintsExample;

import edu.hust.smartcommunity.paginator.domain.PageBounds;
import edu.hust.smartcommunity.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ComplaintsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    int countByExample(ComplaintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    int deleteByExample(ComplaintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    int insert(Complaints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    int insertSelective(Complaints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    List<Complaints> selectByExample(ComplaintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    Complaints selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    int updateByExampleSelective(@Param("record") Complaints record, @Param("example") ComplaintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    int updateByExample(@Param("record") Complaints record, @Param("example") ComplaintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    int updateByPrimaryKeySelective(Complaints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    int updateByPrimaryKey(Complaints record);
    /**
     * add
     */
    /**
     * 查询投诉信息
     * @param complaintsExample
     * @return
     */
    public PageList<Complaints> selectComplaintsAndImages(@Param("example") ComplaintsExample complaintsExample);
    public PageList<Complaints> selectComplaintsAndImages(@Param("example") ComplaintsExample complaintsExample,PageBounds pageBounds);
    public int updateFeedback(@Param("id") Integer id,@Param("feedback") String feedback);
}