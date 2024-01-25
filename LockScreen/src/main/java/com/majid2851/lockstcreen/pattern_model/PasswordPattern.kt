package com.majid2851.lockstcreen.pattern_model

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.majid2851.lockscreen.pattern_model.ComposeLockCallback
import com.majid2851.lockscreen.pattern_model.ComposeLockMain
import com.majid2851.lockscreen.pattern_model.Dot


@Composable
fun PasswordPattern(
    onStart: (dot: Dot) -> Unit,
    onResult: (result: String) -> Unit,
    boxSize:Dp,
    sensitivity:Float=80f,
    dotsDefaultColor: Color =Color.Black,
    dotsSecondColor:Color=Color.DarkGray,
    lineColor:Color=Color.Gray,
    dotSize:Float=69f,
    lineStroke:Float=10f,
    animationDuration:Int=200,
    animationDelay:Long=100,
    smallDotSize:Float=42f,

    ) {
    Box(
        modifier = Modifier
            .size(boxSize),
        contentAlignment = Alignment.Center
    ) {
        ComposeLockMain(
            modifier = Modifier
                .fillMaxSize(),
            dimension = 3,
            sensitivity = sensitivity,
            dotsDefaultColor = dotsDefaultColor,
            dotsSecondColor = dotsDefaultColor,
            dotsSize = dotSize,
            linesColor = lineColor,
            linesStroke = lineStroke,
            animationDuration = animationDuration,
            animationDelay = animationDelay,
            callback = object : ComposeLockCallback {
                override fun onStart(dot: Dot)  = Unit
                override fun onDotConnected(dot: Dot)  = Unit
                override fun onResult(result: List<Dot>, dotIdAsPassword: String) = Unit
            }
        )

        ComposeLockMain(
            modifier = Modifier
                .fillMaxSize(),
            dimension = 3,
            sensitivity = sensitivity,
            dotsDefaultColor = dotsSecondColor,
            dotsSecondColor = dotsSecondColor,
            dotsSize = smallDotSize,
            linesColor =lineColor,
            linesStroke = lineStroke,
            animationDuration = 0,
            animationDelay = animationDelay,
            callback = object : ComposeLockCallback {
                override fun onStart(dot: Dot) {
                    onStart(dot)
                }

                override fun onDotConnected(dot: Dot) {

                }

                override fun onResult(result: List<Dot>, dotIdAsPassword: String) {
                    onResult(dotIdAsPassword)
                }
            }
        )

    }
}