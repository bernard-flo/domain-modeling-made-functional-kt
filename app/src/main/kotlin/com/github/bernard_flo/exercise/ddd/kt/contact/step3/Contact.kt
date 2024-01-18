package com.github.bernard_flo.exercise.ddd.kt.contact.step3

import com.github.bernard_flo.exercise.ddd.kt.contact.step2.EmailContactInfo
import com.github.bernard_flo.exercise.ddd.kt.contact.step2.PersonalName

//
// "AA contact must have an email or a postal address"
//

/**
 * Email and address separate
 */
data class Contact(
    val name: PersonalName,

    // Doesn't meet requirements.
    // Both could not be missing.
    val email: EmailContactInfo?,
    val address: PostalContactInfo?,
)
