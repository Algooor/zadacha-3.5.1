package ru.netology

class PostNotFoundException(message: String) : RuntimeException(message)

class WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    fun add(post: Post): Post {
        val newPost = post.copy(id = propertyId())
        posts += newPost
        return posts.last()
    }

    fun createComment(comment: Comment): Comment {
        val postId = comment.postId
        for (post in posts) {
            if (post.id == postId) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException("нет поста с id = $postId")
    }

    fun update(post: Post): Boolean {
        val postId = post.id
        for ((index, updatePost) in posts.withIndex())
            if (updatePost.id == postId) {
                posts[index] = post.copy(
                    ownerId = updatePost.ownerId,
                    data = updatePost.data
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

