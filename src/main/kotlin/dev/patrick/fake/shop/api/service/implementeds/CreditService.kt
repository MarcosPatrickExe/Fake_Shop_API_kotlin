package dev.patrick.fake.shop.api.service.implementeds
import dev.patrick.fake.shop.api.entity.Credit
import dev.patrick.fake.shop.api.repository.CreditRepository
import dev.patrick.fake.shop.api.repository.CustomerRepository
import dev.patrick.fake.shop.api.service.ICreditService
import org.springframework.stereotype.Service
import java.util.*


@Service
class CreditService(
        private val creditRepository: CreditRepository,
        private val customerService: CustomerService
) :ICreditService{

    override fun save( cred: Credit ): Credit {

        // verifying if customer of credit exits for after save the new Credit
        cred.apply {
              this.customer = customerService.findById(  cred.customer?.id!!   )
        }

         return this.creditRepository.save( cred );
    }


    override fun findAllByCustomer(custonId: Long): Credit {
        TODO("Not yet implemented")
    }


    override fun findByCreditCode(credCode: UUID): Credit {
        TODO("Not yet implemented")
    }

}