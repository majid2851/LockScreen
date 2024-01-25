package com.majid2851.lockscreen.pattern_model


interface ComposeLockCallback {
    fun onStart(dot: Dot)
    fun onDotConnected(dot: Dot)
    fun onResult(result:List<Dot>, dotIdAsPassword: String)
}