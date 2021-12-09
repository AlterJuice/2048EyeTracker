package com.alterjuice.eyeTrackerGame2048.data

enum class SwipeDirections {
    RIGHT, DOWN, LEFT, UP, RIGHT_OR_DOWN, LEFT_OR_UP, ON_PLACE;

    fun isHorizontal(d: SwipeDirections): Boolean{ return d == RIGHT || d == LEFT; }
    fun isVertical(d: SwipeDirections): Boolean{ return d == UP || d == DOWN; }
    fun isRightOrDown(d: SwipeDirections): Boolean{ return d == RIGHT || d == DOWN || d == RIGHT_OR_DOWN; }
    fun isLeftOrUp(d: SwipeDirections): Boolean{ return d == LEFT || d == UP || d == LEFT_OR_UP; }
}