package com.example.rest.user.mapper

import com.example.rest.user.model.User
import org.apache.ibatis.annotations.*

@Mapper
interface UserMapper {
    @Select("SELECT * FROM userinfo WHERE id = #{id}")
    fun getUser(@Param("id") id: String): User

    @Select("SELECT * FROM userinfo")
    fun getUsers(): List<User>

    @Insert("INSERT INTO userinfo VALUES(#{id}, #{name}, #{memo})")
    fun createUser(
        @Param("id") id: String,
        @Param("name") name: String,
        @Param("memo") phone: String
    ): Int

    @Update("UPDATE userinfo SET name=#{name}, memo=#{memo} WHERE id=#{id}")
    fun updateUser(
        @Param("id") id: String,
        @Param("name") name: String,
        @Param("memo") phone: String
    ): Int

    @Delete("DELETE FROM userinfo WHERE id=#{id}")
    fun deleteUser(@Param("id") id: String): Int
}