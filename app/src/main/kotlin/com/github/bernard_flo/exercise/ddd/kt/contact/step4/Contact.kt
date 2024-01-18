package com.github.bernard_flo.exercise.ddd.kt.contact.step4

import com.github.bernard_flo.exercise.ddd.kt.contact.step2.EmailContactInfo
import com.github.bernard_flo.exercise.ddd.kt.contact.step2.PersonalName
import com.github.bernard_flo.exercise.ddd.kt.contact.step3.PostalContactInfo

//
// "A contact must have an email or a postal address"
//

/**
 * Email and address merged into one type
 * (only three possibilities)
 */
sealed interface ContactInfo {

    @JvmInline
    value class EmailOnly(val emailContactInfo: EmailContactInfo) : ContactInfo

    @JvmInline
    value class AddrOnly(val postalContactInfo: PostalContactInfo) : ContactInfo

    @JvmInline
    value class EmailAndAddr(val emailContactInfoAndPostalContactInfo: Pair<EmailContactInfo, PostalContactInfo>) :
        ContactInfo
}

data class Contact(
    val name: PersonalName,
    val contactInfo: ContactInfo,
)
