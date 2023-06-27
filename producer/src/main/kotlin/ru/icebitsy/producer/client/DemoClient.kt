package ru.icebitsy.producer.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

/**
 * API взаимодействия с OTP сервисом управления пин кодами
 */
@FeignClient(value = "tsp-agent-v1", url = "\${consumer.url}")
interface DemoClient {
    @GetMapping("/ping")
    fun test(): ResponseEntity<String>
}