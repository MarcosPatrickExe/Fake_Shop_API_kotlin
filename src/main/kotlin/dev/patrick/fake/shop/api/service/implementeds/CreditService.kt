package dev.patrick.fake.shop.api.service.implementeds
import dev.patrick.fake.shop.api.entity.Credit
import dev.patrick.fake.shop.api.service.ICreditService
import org.springframework.stereotype.Service
import java.util.*


@Service
class CreditService :ICreditService{
    override fun save(cred: Credit): Credit {
        TODO("Not yet implemented")
    }

    override fun findAllByCustomer(custonId: Long): Credit {
        TODO("Not yet implemented")
    }

    override fun findByCreditCode(credCode: UUID): Credit {
        TODO("Not yet implemented")
    }


}