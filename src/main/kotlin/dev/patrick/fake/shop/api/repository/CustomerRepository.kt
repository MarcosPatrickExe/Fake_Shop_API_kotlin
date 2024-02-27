package dev.patrick.fake.shop.api.repository
import dev.patrick.fake.shop.api.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository  :JpaRepository<Customer, Long>{
}