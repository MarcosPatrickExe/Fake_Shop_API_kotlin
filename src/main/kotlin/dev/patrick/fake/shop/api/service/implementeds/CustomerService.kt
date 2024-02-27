package dev.patrick.fake.shop.api.service.implementeds
import dev.patrick.fake.shop.api.entity.Customer
import dev.patrick.fake.shop.api.repository.CreditRepository
import dev.patrick.fake.shop.api.repository.CustomerRepository
import dev.patrick.fake.shop.api.service.ICustomerService
import org.springframework.stereotype.Service
import java.util.Optional


@Service
class CustomerService(  private val customRepo : CustomerRepository  ) :ICustomerService {

    override fun save( custom: Customer): Customer =  this.customRepo.save( custom )

    override fun findById( id: Long ): Customer {

           return  this.customRepo.findById( id ) .orElseThrow{
                 throw RuntimeException("Customer with ID: $id not found!!")
           }
    }

    override fun delete( id: Long) {
          this.customRepo.deleteById( id )

           //  TODO("Not yet implemented")
    }

}
