package com.github.kotlintelegrambot.entities.files

import com.google.gson.annotations.SerializedName

/**
 * Represents an animation file (GIF or H.264/MPEG-4 AVC video without sound).
 * https://core.telegram.org/bots/api#animation
 */
data class Animation(
    @SerializedName(FilesFields.fileId) val fileId: String = "",
    @SerializedName(FilesFields.fileUniqueId) val fileUniqueId: String = "",
    @SerializedName(FilesFields.width) val width: Int = 0,
    @SerializedName(FilesFields.height) val height: Int = 0,
    @SerializedName(FilesFields.duration) val duration: Int = 0,
    @SerializedName(FilesFields.thumb) val thumb: PhotoSize? = null,
    @SerializedName(FilesFields.fileName) val fileName: String? = null,
    @SerializedName(FilesFields.mimeType) val mimeType: String? = null,
    @SerializedName(FilesFields.fileSize) val fileSize: Long? = null,
)
