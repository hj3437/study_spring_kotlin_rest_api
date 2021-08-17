package com.example.rest.user.controller

import com.example.rest.user.mapper.UserMapper
import org.springframework.web.bind.annotation.*

@RestController
class UserController(private val mapper: UserMapper) {
    @GetMapping("user/{id}")
    fun getUser(@PathVariable("id") id: String) = mapper.getUser(id)

    @GetMapping("user/all")
    fun getUser() = mapper.getUsers()

    @PutMapping("/user/{id}")
    fun createUser(
        @PathVariable("id") id: String,
        @RequestParam("name") name: String,
        @RequestParam("memo") memo: String
    ){
        mapper.createUser(id, name, memo)
    }
//
//    @PutMapping("/user/{id}")
//    fun updateUser(
//        @PathVariable("id") id: String,
//        @RequestParam("name") name: String,
//        @RequestParam("memo") memo: String
//    ){
//        mapper.updateUser(id, name, memo)
//    }
//
//    @DeleteMapping("/user/{id}")
//    fun deleteUser(@PathVariable("id") id: String) {
//        mapper.deleteUser(id)
//    }
}