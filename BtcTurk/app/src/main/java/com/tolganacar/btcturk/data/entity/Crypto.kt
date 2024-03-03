package com.tolganacar.btcturk.data.entity

data class Crypto(
    var id: Int,
    var shortName: String,
    var fullName: String,
    var price: String,
    var volume: String,
    var change: String,
    var lineChart: String
)