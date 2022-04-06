package ru.netology

import ru.netology.Attachment.Attachment

data class Comment (
    val ownerId: Int,
    val postId: Int,
    val fromGroup: Int = 0,
    val message: String,
    val replayToComments :Int,
    val attachments: Array<Attachment>?,
    val stickerId:Int,
    val guid : Int
) {

}