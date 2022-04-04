package ru.netology.Attachment

class GraffitiAttachments(
    val id: Int,
    val ownerId: Int,
    val url: String,
    val width: Int,
    val height: Int

) : Attachment {
    override val type: String
        get() = "Graffiti"
}