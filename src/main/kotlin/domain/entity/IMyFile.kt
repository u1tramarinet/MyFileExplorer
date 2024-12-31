package domain.entity

import java.io.File

data class MyFile(
    val name: String,
    val path: String,
) {
    companion object {
        fun from(file: File): MyFile? {
            return if (file.isFile) {
                return MyFile(
                    name = file.name,
                    path = file.path,
                )
            } else {
                null
            }
        }
    }
}