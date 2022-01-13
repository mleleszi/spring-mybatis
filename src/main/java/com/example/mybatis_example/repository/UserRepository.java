package com.example.mybatis_example.repository;

import com.example.mybatis_example.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserRepository {

    @Select("SELECT * FROM user")
    List<User> findAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    Optional<User> findById(@Param("id") Long id);

    @Insert("INSERT INTO user VALUES(#{id}, #{name}, #{age})")
    void insert(User user);

    @Update("UPDATE user SET name = #{name}, age = #{age} WHERE id = #{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void delete(@Param("id") Long id);
}
