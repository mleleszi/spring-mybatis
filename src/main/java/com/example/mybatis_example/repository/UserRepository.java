package com.example.mybatis_example.repository;

import com.example.mybatis_example.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserRepository {

    @Select("SELECT * from USER")
    List<User> findAll();

    @Select("SELECT * from USER WHERE id = #{id}")
    Optional<User> findById(@Param("id") Long id);
}
