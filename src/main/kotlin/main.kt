package ru.netology

fun main() {
    val firstPost = Post(
        id = 0,
        ownerId = 1,
        fromId = 1,
        createdBy = 1,
        data = 15062006,
        text = "Приветствую! Это будет первый пост в моей социальной сети. =) ",
        replyOwnerId = 12,
        replyPostId = 1,
        friendsOnly = false,
        comments = Post.Comments(2),
        copyright = "gin",
        likes = Post.Likes(12),
        reposts = Post.Reposts(1),
        views = Post.Views(121),
        postType = PostType.Post,
        singerId = 1,
        canPin = false, canDelete = false,
        canEdit = false, isPinned = true,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 0
    )
    val secondPost = Post(
        id = 2,
        ownerId = 1,
        fromId = 1,
        createdBy = 1,
        data = 15062006,
        text = "Приветствую! Это второй пост. ",
        replyOwnerId = 12,
        replyPostId = 1,
        friendsOnly = true,
        comments = Post.Comments(2),
        copyright = "nig",
        likes = Post.Likes(12),
        reposts = Post.Reposts(1),
        views = Post.Views(84),
        postType = PostType.Copy,
        singerId = 1,
        canPin = false, canDelete = true,
        canEdit = false, isPinned = true,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 0
    )
    val threePost = Post(
        id = 0,
        ownerId = 1,
        fromId = 1,
        createdBy = 1,
        data = 15062006,
        text = "Третий пост",
        replyOwnerId = 12,
        replyPostId = 1,
        friendsOnly = false,
        comments = Post.Comments(2),
        copyright = "gin",
        likes = Post.Likes(12),
        reposts = Post.Reposts(1),
        views = Post.Views(121),
        postType = PostType.Post,
        singerId = 1,
        canPin = false, canDelete = false,
        canEdit = false, isPinned = true,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 0
    )

    val result = WallService()
    println(result.add(firstPost))
    println(result.add(secondPost))
    println(result.add(threePost))
    println(result.update(secondPost))

}