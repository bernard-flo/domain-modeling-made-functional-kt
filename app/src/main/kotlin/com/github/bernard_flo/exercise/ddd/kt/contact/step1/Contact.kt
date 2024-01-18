package com.github.bernard_flo.exercise.ddd.kt.contact.step1

data class Contact(

    // Must be updated as a group (these fields are linked)
    val firstName: String,  // Must not be more than 50 chars (constraints)
    val middleInitial: String,  // This value is optional
    val lastName: String,

    val emailAddress: String,
    val isEmailVerified: Boolean,  // Must be reset if email is changed (domain logic)
)
