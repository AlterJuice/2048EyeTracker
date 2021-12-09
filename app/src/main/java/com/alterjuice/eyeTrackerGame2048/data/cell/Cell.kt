package com.alterjuice.eyeTrackerGame2048.data.cell

class Cell constructor(val value: Int, val power: Int) {
    constructor() : this(0, 0) {

    }

    fun canBeJoined(anotherCell: Cell) = this.power == anotherCell.power
    fun isEmpty() = power == 0


    class Factory{
        fun createEmpty(){

        }
    }
}