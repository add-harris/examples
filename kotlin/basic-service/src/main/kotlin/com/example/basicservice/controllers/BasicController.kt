package com.example.basicservice.controllers

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicController {

    companion object {
        var count = 0
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun basicGet() {
        count++
        println(count)
    }

}