package com.jikey.englishwithjikey.plus.ui.components

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import com.jikey.englishwithjikey.plus.ui.components.animations.bounceClick

@Composable
fun AnimatedExtendedFloatingActionButton(
    visible : Boolean = true ,
    onClick : () -> Unit ,
    icon : @Composable () -> Unit ,
    text : (@Composable () -> Unit)? = null ,
    offsetX : Float = 50f ,
    offsetY : Float = 50f ,
    scale : Float = 0.8f ,
    animationSpec : AnimationSpec<Float> = tween(
        durationMillis = 300 , easing = FastOutSlowInEasing
    )
) {
    val animatedOffsetX by animateFloatAsState(
        targetValue = if (visible) 0f else offsetX ,
        animationSpec = animationSpec ,
        label = "OffsetX"
    )
    val animatedOffsetY by animateFloatAsState(
        targetValue = if (visible) 0f else offsetY ,
        animationSpec = animationSpec ,
        label = "OffsetY"
    )
    val animatedScale by animateFloatAsState(
        targetValue = if (visible) 1f else scale , animationSpec = animationSpec , label = "Scale"
    )

    ExtendedFloatingActionButton(onClick = onClick ,
                                 icon = icon ,
                                 text = text ?: {} ,
                                 modifier = Modifier
                                         .bounceClick()
                                         .graphicsLayer {
                                             scaleX = animatedScale
                                             scaleY = animatedScale
                                             translationX = animatedOffsetX
                                             translationY = animatedOffsetY
                                         })
}