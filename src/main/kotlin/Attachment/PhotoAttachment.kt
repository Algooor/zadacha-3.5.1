package ru.netology.Attachment

data class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo = Photo(0, 0, 0, 0, "", 0)
) : Attachment {

    data class Photo(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int,
        val text: String,
        val date: Int
    )
}