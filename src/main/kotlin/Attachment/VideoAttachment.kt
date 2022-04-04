package ru.netology.Attachment

class VideoAttachment(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val duration: Int,
    val url: String,
    val date: Int,
    val views: Int,
    val comments: Int,
    val player: String

) : Attachment {
    override val type: String
        get() = "Video"

}