package ru.icebitsy.producer.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.icebitsy.producer.client.DemoClient

@RestController
class PingController(private val demoClient: DemoClient) {
    @GetMapping("/ping")
    fun ping() : ResponseEntity<String> {
        return demoClient.test()
    }
}