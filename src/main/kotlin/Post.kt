package ru.netology

enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val data: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: String,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: PostType,
    val singerId: Int,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean,
    val postponedId: Int
) {
    data class Comments(
        val count: Int,
        val canPost: Boolean = false,
        val groupsCanPost: Boolean = false,
        val canClose: Boolean = false,
        val canOpen: Boolean = false
    )

    data class Likes(
        val count: Int,
        val userLikes: Boolean = false,
        val canLikes: Boolean = false,
        val canPublish: Boolean = false
    )

    data class Reposts(
        val count: Int,
        val userReposted: Boolean = false,
    )

    data class Views(
        val count: Int
    )
}
