package ru.netology.Attachment

class PhotoAttachment(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int

) : Attachment {
    override val type: String
        get() = "Photo"
}