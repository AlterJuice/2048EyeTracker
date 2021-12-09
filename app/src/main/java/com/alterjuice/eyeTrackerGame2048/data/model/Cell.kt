package com.alterjuice.eyeTrackerGame2048.data.model

class Cell private constructor(power: Int){
    public constructor(): this(0)

    // private var value: Double = 0.0
    private var value: Double = 0.0
    get() {
        return Math.pow(2.toDouble(), power.toDouble()).let { if (it == 1.toDouble()) 0 else it }.toDouble()
    }
    private var power: Int = 0


    fun isEmpty(): Boolean = power == 0
    fun canBeJoined(another: Cell): Boolean = this.power == another.power
    fun clear(){
        value = 0.0
        power = 0
    }

    fun joinWith(another: Cell){ if (canBeJoined(another)) power++ }

    class Factory(){
        fun createEmpty(): Cell = Cell(0)
        fun createStart(): Cell = Cell(1)
    }

}