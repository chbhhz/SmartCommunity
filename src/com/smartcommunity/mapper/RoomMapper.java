package com.smartcommunity.mapper;

import com.smartcommunity.pojo.Room;
import com.smartcommunity.pojo.RoomExample;

import edu.hust.smartcommunity.paginator.domain.PageBounds;
import edu.hust.smartcommunity.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Tue Jan 20 16:35:08 CST 2015
     */
    int countByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Tue Jan 20 16:35:08 CST 2015
     */
    int deleteByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Tue Jan 20 16:35:08 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Tue Jan 20 16:35:08 CST 2015
     */
    int insert(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Tue Jan 20 16:35:08 CST 2015
     */
    int insertSelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Tue Jan 20 16:35:08 CST 2015
     */
    List<Room> selectByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Tue Jan 20 16:35:08 CST 2015
     */
    Room selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Tue Jan 20 16:35:08 CST 2015
     */
    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Tue Jan 20 16:35:08 CST 2015
     */
    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Tue Jan 20 16:35:08 CST 2015
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Tue Jan 20 16:35:08 CST 2015
     */
    int updateByPrimaryKey(Room record);
    /** add_y */
    List<String> selectRoomNumberByExample(RoomExample roomExample);

    PageList<Room> selectByExample(RoomExample example,PageBounds pageBounds);
    /** addend_y */
}