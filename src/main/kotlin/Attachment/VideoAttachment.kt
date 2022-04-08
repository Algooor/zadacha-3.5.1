package ru.netology.Attachment

data class VideoAttachment(
    override val type: String = "video",
    val video: Video = Video(0, 0, "", 0, "", 0, 0, 0, "")
) : Attachment {

    data class Video(
        val id: Int,
        val ownerId: Int,
        val title: String,
        val duration: Int,
        val url: String,
        val date: Int,
        val views: Int,
        val comments: Int,
        val player: String
    )
}