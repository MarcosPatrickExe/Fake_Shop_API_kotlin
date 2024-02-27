package dev.patrick.fake.shop.api.entity
import jakarta.persistence.*


@Entity( )
@Table( name="Client ")
data class Customer(

        @Column( nullable = false )
        var firstName: String = "",

        @Column( nullable = false )
        var lastName: String = "",

        @Column( nullable = false, unique =true )
        val cpf: String = "",

        @Column( nullable = false, unique=true )
        var email: String = "",

        @Column( nullable = false )
        var password :String = "",

        @Column( nullable = false )
        @Embedded
        val address :Address = Address(),


        @Column( nullable = false )
        @OneToMany(
                  fetch = FetchType.LAZY,
                  cascade = arrayOf(   CascadeType.REMOVE, CascadeType.PERSIST  ),
                  mappedBy = "customer"
         )
        var credits :List<Credit> = mutableListOf<Credit>(),

        @Id  @GeneratedValue( strategy = GenerationType.IDENTITY)
        val id: Long? = null
     //  will be generated in the future
)
