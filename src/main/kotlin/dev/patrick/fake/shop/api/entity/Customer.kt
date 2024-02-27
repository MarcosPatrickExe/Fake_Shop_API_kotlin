package dev.patrick.fake.shop.api.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table


data class Customer(
        var firstName: String = "",
        var lastName: String = "",
        val cpf: String = "",
        var email: String = "",
        var password :String = "",
        val address :Address = Address(),
        var credits :List<Credit> = mutableListOf(),
        val id: Long? = null
)
