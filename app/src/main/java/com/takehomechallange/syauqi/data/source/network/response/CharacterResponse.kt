package com.takehomechallange.syauqi.data.source.network.response

import com.google.gson.annotations.SerializedName

data class CharacterResponse(

	@field:SerializedName("image")
	val image: String,

	@field:SerializedName("gender")
	val gender: String,

	@field:SerializedName("species")
	val species: String,

	@field:SerializedName("origin")
	val origin: LocationItem? = null,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("location")
	val location: LocationItem? = null,

	@field:SerializedName("episode")
	val episode: List<String>? = null,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("status")
	val status: String
)
