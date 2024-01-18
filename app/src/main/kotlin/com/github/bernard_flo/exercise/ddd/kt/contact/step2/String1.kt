package com.github.bernard_flo.exercise.ddd.kt.contact.step2

@JvmInline
value class String1
private constructor(
    val string: String,
) {

    companion object {

        fun create(string: String): String1? {

            return if (string.length <= 1) {
                String1(string)
            } else {
                null
            }
        }

    }

}
