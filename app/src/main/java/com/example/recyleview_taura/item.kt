package com.example.recyleview_taura

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class item(
    val gambar: Int,
    val nama: String,
    val deskripsi: String
): Parcelable
