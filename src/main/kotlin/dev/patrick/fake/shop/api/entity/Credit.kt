package dev.patrick.fake.shop.api.entity

import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID


class Credit (
        val creditCode : UUID = UUID.randomUUID(),
        val creditValue : BigDecimal = BigDecimal.ZERO,
        val dayFirstInstallment :LocalDate,          // date of first parcel
        val numberOfInstallments :Int = 0

)
