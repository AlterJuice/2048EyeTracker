package com.alterjuice.eyeTrackerGame2048.data.model

import java.util.*

class Field {
    private val rows: LinkedList<Row> = LinkedList()
    val size get() = rows.size


    fun hasEmpty(): Boolean{
        for (row in rows) if (row.hasEmpty()) return true
        return false

    }
}