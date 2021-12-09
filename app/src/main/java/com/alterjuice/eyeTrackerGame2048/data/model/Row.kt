package com.alterjuice.eyeTrackerGame2048.data.model

import java.util.*

class Row {
    init { clear() }


    private val cells: LinkedList<Cell> = LinkedList()

    private lateinit var rows: LinkedList<Row>
    val size: Int get() = rows.size
    fun get(index: Int) = cells.getOrNull(index)
    val first: Cell? get() = cells.firstOrNull()
    val second: Cell? get() = get(1)
    val last: Cell? get() = cells.lastOrNull()
    val preLast: Cell? get() = get(size-2)

    fun hasEmpty(): Boolean{
        for (cell in cells) if (cell.isEmpty()) return true
        return false
    }

    override fun toString(): String = "Row<${cells}>"
    fun clear() = cells.clear()
    fun countEmpty(): Int = cells.count { it.isEmpty() }
    fun addCell(cell: Cell){ cells.add(cell) }
    fun addCell(index: Int, cell: Cell){ cells.add(index, cell) }

    fun remove(index: Int): Cell?{
        return if (size >= index+1) cells.removeAt(index) else null
    }
    fun removeFirst(): Cell? = remove(0)
    fun removeLast(): Cell? = remove(size-1)

}