package com.github.bernard_flo.exercise.ddd.kt.contact.step2

@JvmInline
value class String50
private constructor(
    val string: String,
) {

    companion object {

        fun create(string: String): String50? {

            return if (string.length <= 50) {
                String50(string)
            } else {
                null
            }
        }

    }

}
