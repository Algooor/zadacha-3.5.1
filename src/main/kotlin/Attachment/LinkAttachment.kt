package ru.netology.Attachment

class LinkAttachment(
    val url: String,
    val title: String,
    val description: String,
    val caption: String?

) : Attachment {
    override val type: String
        get() = "Link"

}