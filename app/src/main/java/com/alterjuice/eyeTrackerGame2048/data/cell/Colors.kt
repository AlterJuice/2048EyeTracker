package com.alterjuice.eyeTrackerGame2048.data.cell

enum class Colors(val colorHash: String) {
    LIGHT_BLUE("#123")

    ;

    fun getColorForCell(cell: Cell): Colors{
        when(cell){
            else -> LIGHT_BLUE
        }
        return LIGHT_BLUE
    }
}