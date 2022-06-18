package com.example.kotlincompose.feature_note.peresention.notes.componets

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlincompose.feature_note.domain.util.NoteOrder
import com.example.kotlincompose.feature_note.domain.util.OrderType


@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OrderType.Dscending),
    onOrderChange : (NoteOrder) -> Unit
) {
    Column (
            modifier = modifier
       ){
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
       DefultRadioButton(text = "Title",
           selected = noteOrder is NoteOrder.Title,
           onSelect = { onOrderChange(NoteOrder.Title(noteOrder.orderType))}
       )
        Spacer(modifier = Modifier.width(8.dp))
        DefultRadioButton(text = "Date",
            selected = noteOrder is NoteOrder.Date,
            onSelect = { onOrderChange(NoteOrder.Date(noteOrder.orderType))}
        )
        Spacer(modifier = Modifier.width(8.dp))
        DefultRadioButton(text = "Color",
            selected = noteOrder is NoteOrder.Color,
            onSelect = { onOrderChange(NoteOrder.Color(noteOrder.orderType))}
        )
    }
        Spacer(modifier = Modifier.height(16.dp))
        Row (
            modifier = Modifier.fillMaxSize()
         ){
            DefultRadioButton(text = "Ascending",
                selected = noteOrder.orderType is OrderType.Ascending,
                onSelect = {
                    onOrderChange(noteOrder.copy(OrderType.Ascending))
                }
            )
            Spacer(modifier = Modifier.width(8.dp))
            DefultRadioButton(text = "Descending",
                selected = noteOrder.orderType is OrderType.Dscending,
                onSelect = {
                    onOrderChange(noteOrder.copy(OrderType.Dscending))
                }
            )
        }
    }

}