package ru.icebitsy.consumer.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController {
    @GetMapping("/ping")
    fun ping() : ResponseEntity<String> = ResponseEntity.ok("PONG")
}