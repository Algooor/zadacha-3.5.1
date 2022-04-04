package ru.netology.Attachment

class AudioAttachment(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val date: Int

) : Attachment {
    override val type: String
        get() = "Audio"


}