package dev.patrick.fake.shop.api.entity
import dev.patrick.fake.shop.api.utils.Status
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID


@Entity( )
@Table( name="Credit ")
data class Credit (

        @Column( nullable = false, unique=true)
        val creditCode : UUID = UUID.randomUUID(),

        @Column( nullable = false)
        val creditValue : BigDecimal = BigDecimal.ZERO,

        @Column( nullable = false)
        val dayFirstInstallment :LocalDate,                   // date of first parcel

        @Column( nullable = false)
        val numberOfInstallments :Int = 0,

        @Enumerated
        val status : Status = Status.PROGRESS,

        @ManyToOne
        val customer :Customer? = null,                      // willl be created when the Credit instance

       @Id
        val  id: Long? = null
)
