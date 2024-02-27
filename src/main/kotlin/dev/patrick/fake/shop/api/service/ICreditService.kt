package dev.patrick.fake.shop.api.service

import dev.patrick.fake.shop.api.entity.Credit
import java.util.UUID


interface ICreditService {

    fun save( cred: Credit): Credit
    // save new credit request

    fun findAllByCustomer( custonId: Long ) :Credit
    // find the all Credits of customer by it 'ID'

    fun findByCreditCode( credCode :UUID) :Credit
    // find Credit by your 'ID'
}