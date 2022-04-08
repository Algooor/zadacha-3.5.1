package ru.netology.Attachment

data class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio = Audio(0, 0, "", "", 0, "", 0)
) : Attachment {

    data class Audio(
        val id: Int,
        val ownerId: Int,
        val artist: String,
        val title: String,
        val duration: Int,
        val url: String,
        val date: Int
    )
}



