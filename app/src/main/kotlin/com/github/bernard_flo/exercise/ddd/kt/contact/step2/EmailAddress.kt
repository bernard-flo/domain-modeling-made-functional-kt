package com.github.bernard_flo.exercise.ddd.kt.contact.step2

@JvmInline
value class EmailAddress
private constructor(
    val string: String,
) {

    companion object {

        private val regex = Regex("""^\S+@\S+\.\S+$""")

        fun create(string: String): EmailAddress? {

            return if (regex.matches(string)) {
                EmailAddress(string)
            } else {
                null
            }
        }

    }

}
