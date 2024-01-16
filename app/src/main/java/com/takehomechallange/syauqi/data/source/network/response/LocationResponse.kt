package com.takehomechallange.syauqi.data.source.network.response

import com.google.gson.annotations.SerializedName

data class LocationResponse(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("type")
	val type: String,

	@field:SerializedName("dimension")
	val dimension: String,

	@field:SerializedName("id")
	val id: Int,
)
data class LocationItem(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)