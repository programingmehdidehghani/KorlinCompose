package com.example.kotlincompose.feature_note.domain.util

sealed class OrderType{
    object Ascending: OrderType()
    object Dscending: OrderType()
}