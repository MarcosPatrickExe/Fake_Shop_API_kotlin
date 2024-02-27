package dev.patrick.fake.shop.api.repository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface Customer  :JpaRepository<Customer, Long>{
}