package com.github.bernard_flo.exercise.ddd.kt.contact.step2

@JvmInline
value class VerifiedEmail(val emailAddress: EmailAddress)

typealias VerificationService = (EmailAddress, VerificationHash) -> VerifiedEmail?

sealed interface EmailContactInfo {

    @JvmInline
    value class Unverified(val emailAddress: EmailAddress) : EmailContactInfo

    @JvmInline
    value class Verified(val verifiedEmail: VerifiedEmail) : EmailContactInfo
}

data class PersonalName(
    val firstName: String50,
    val middleInitial: String1?,
    val lastName: String50,
)

data class Contact(
    val name: PersonalName,
    val email: EmailContactInfo,
)
