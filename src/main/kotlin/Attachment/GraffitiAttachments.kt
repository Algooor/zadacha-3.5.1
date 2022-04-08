package ru.netology.Attachment

data class GraffitiAttachments(
    override val type: String = "graffiti",
    val graffiti: Graffiti = Graffiti(0, 0, "", 0, 0)
) : Attachment {

    data class Graffiti(
        val id: Int,
        val ownerId: Int,
        val url: String,
        val width: Int,
        val height: Int
    )
}