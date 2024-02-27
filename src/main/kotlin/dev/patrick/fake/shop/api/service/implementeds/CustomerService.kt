package dev.patrick.fake.shop.api.service.implementeds
import dev.patrick.fake.shop.api.entity.Customer
import dev.patrick.fake.shop.api.service.ICustomerService
import org.springframework.stereotype.Service


@Service
public class CustomerService :ICustomerService {
    override fun save( custom: Customer): Customer {

        TODO("Not yet implemented")
    }

    override fun findById(id: Long): Customer {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long): Customer {
        TODO("Not yet implemented")
    }


}
