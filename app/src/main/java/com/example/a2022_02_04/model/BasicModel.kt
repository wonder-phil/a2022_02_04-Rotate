package com.example.a2022_02_04.model

class BasicModel(val _count: Int) {
    private var count: Int = _count

    public fun getCount(): Int {
        return count
    }
    public fun incrementCount(by: Int) {
        count += by
    }
}