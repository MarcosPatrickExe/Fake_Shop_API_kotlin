package dev.patrick.fake.shop.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FakeShopApiApplication

fun main(args: Array<String>) {
  	runApplication<FakeShopApiApplication>(*args)
}
