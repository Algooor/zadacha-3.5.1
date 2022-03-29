package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addTest() {
        val service = WallService()
        val result1 = service.add(
            Post(
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
        )
        // act
        val result = service.add(result1)
        //assert
        assertNotEquals(0, result)

    }

    @Test
    fun updateTestTrue() {
        val service = WallService()
        service.add(
            Post(
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
        )
        val update = Post(
            id = 1,
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
        // act
        val result = service.update(update)
        //assert
        assertTrue(result)

    }

    @Test
    fun updateTestFalse() {
        val service = WallService()
        service.add(
            Post(
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
        )
        val update = Post(
            id = 0,
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
        // act
        val result = service.update(update)
        // assert
        assertFalse(result)
    }
}