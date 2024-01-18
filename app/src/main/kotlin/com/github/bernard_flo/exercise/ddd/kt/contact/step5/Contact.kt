package com.github.bernard_flo.exercise.ddd.kt.contact.step5

import com.github.bernard_flo.exercise.ddd.kt.contact.step2.EmailContactInfo
import com.github.bernard_flo.exercise.ddd.kt.contact.step2.PersonalName
import com.github.bernard_flo.exercise.ddd.kt.contact.step3.PostalContactInfo

//
// "A contact must have at least one way of being contacted"
//

/**
 * Way of being contacted
 */
sealed interface ContactInfo {

    @JvmInline
    value class Email(val emailContactInfo: EmailContactInfo) : ContactInfo

    @JvmInline
    value class Addr(val postalContactInfo: PostalContactInfo) : ContactInfo
}

data class Contact(
    val name: PersonalName,
    val primaryContactInfo: ContactInfo,  // One way of being contacted is required
    val secondaryContactInfo: ContactInfo?,
)
