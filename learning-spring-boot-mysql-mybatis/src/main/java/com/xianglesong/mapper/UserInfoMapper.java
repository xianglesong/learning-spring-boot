package com.xianglesong.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xianglesong.entity.UserInfoEntity;

import java.util.List;

public interface UserInfoMapper {

  @Select("SELECT * FROM user_info")
  @Results({@Result(property = "userName", column = "user_name"),
      @Result(property = "passWord", column = "user_pwd")})
  List<UserInfoEntity> getAll();

  @Select("SELECT * FROM user_info WHERE id = #{id}")
  @Results({@Result(property = "userName", column = "user_name"),
      @Result(property = "passWord", column = "user_pwd")})
  UserInfoEntity getOne(Long id);

  @Insert("INSERT INTO user_info(id,user_name,user_pwd) VALUES(#{id}, #{userName}, #{passWord})")
  void insert(UserInfoEntity user);

  @Update("UPDATE user_info SET user_name=#{userName},user_pwd=#{passWord} WHERE id =#{id}")
  void update(UserInfoEntity user);

  @Delete("DELETE FROM user_info WHERE id =#{id}")
  void delete(Long id);

}
