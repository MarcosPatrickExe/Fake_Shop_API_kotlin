package dev.patrick.fake.shop.api.service
import dev.patrick.fake.shop.api.entity.Customer


interface ICustomerService {

    fun save( custom : Customer): Customer

    fun findById( id: Long): Customer

    fun delete(id: Long): Customer
}