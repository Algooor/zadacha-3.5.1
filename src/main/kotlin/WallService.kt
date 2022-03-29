package ru.netology

class WallService {

    private var posts = emptyArray<Post>()
    fun add(post: Post): Post {
        val post = post.copy(id = propertyId())
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val postId = post.component1()
        for ((index, post) in posts.withIndex())
            if (post.id == postId) {
                posts[index] = post.copy(
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    singerId = post.singerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    postponedId = post.postponedId
                )
                return true
            }
        return false
    }

    private var property: Int = 0
    private fun propertyId(): Int {
        property++
        return property
    }
}

