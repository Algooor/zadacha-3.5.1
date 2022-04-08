package ru.netology.Attachment

data class LinkAttachment(
    override val type: String = "link",
    val link: Link = Link("", "", "", "")
) : Attachment {

    data class Link(
        val url: String,
        val title: String,
        val description: String,
        val caption: String?
    )
}
