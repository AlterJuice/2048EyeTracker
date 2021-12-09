package com.alterjuice.eyeTrackerGame2048.data.calculations

abstract class SwipeDetector {
    companion object{
        const val MIN_DISTANCE = 150

    }

    abstract fun onSwap()
}