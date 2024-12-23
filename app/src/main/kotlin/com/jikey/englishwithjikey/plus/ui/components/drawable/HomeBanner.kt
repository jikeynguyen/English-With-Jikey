package com.jikey.englishwithjikey.plus.ui.components.drawable

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


@Composable
fun homeBanner(
    colorPrimary : Color = MaterialTheme.colorScheme.primary ,
    colorTertiary : Color = MaterialTheme.colorScheme.tertiary ,
    colorSecondaryContainer : Color = MaterialTheme.colorScheme.secondaryContainer ,
    colorPrimaryContainer : Color = MaterialTheme.colorScheme.primaryContainer ,
    colorOnSecondary : Color = MaterialTheme.colorScheme.onSecondary ,
    colorOnPrimary : Color = MaterialTheme.colorScheme.onPrimary
) : ImageVector {
    return remember(
        colorPrimary ,
        colorTertiary ,
        colorSecondaryContainer ,
        colorPrimaryContainer ,
        colorOnSecondary ,
        colorOnPrimary
    ) {
        ImageVector.Builder(
            name = "Home Banner" ,
            defaultWidth = 640.dp ,
            defaultHeight = 360.dp ,
            viewportWidth = 640f ,
            viewportHeight = 360f
        ).apply {
            path(
                fill = SolidColor(colorPrimary) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(0f , 0f)
                lineTo(0f , 353f)
                curveTo(273.5f , 94.4f , 435.7f , 218.7f , 640f , 139.6f)
                lineTo(640f , 0f)
                lineTo(0f , 0f)
                close()
            }
            path(
                fill = SolidColor(colorTertiary) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(458.8f , 360.3f)
                lineTo(570.6f , 360.3f)
                curveTo(570.6f , 360.3f , 565.2f , 317f , 569f , 295.1f)
                curveTo(575.1f , 293.8f , 582f , 363f , 583.1f , 360.3f)
                lineTo(635.1f , 360.3f)
                curveTo(578.1f , 215.2f , 591.9f , 235.3f , 447.6f , 246.4f)
                curveTo(447.6f , 246.4f , 424.5f , 274.4f , 415.1f , 300.8f)
                curveTo(405.7f , 327.2f , 391.7f , 352.7f , 390.9f , 355.2f)
                curveTo(389.4f , 360f , 390.8f , 360.4f , 390.8f , 360.4f)
                lineTo(442f , 360.4f)
                curveTo(443.1f , 361.8f , 459.4f , 278.7f , 461.5f , 298.1f)
            }
            path(
                fill = SolidColor(Color(0xFFE9B697)) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(553.7f , 243.5f)
                curveTo(556.9f , 243.5f , 559.9f , 242.8f , 562.5f , 241.5f)
                curveTo(564f , 241.9f , 565.6f , 242.1f , 567.2f , 242.1f)
                curveTo(578.8f , 242.1f , 588.2f , 232.7f , 588.2f , 221.1f)
                curveTo(588.2f , 220.6f , 588.2f , 220.1f , 588.1f , 219.6f)
                curveTo(591.7f , 215.8f , 593.9f , 210.8f , 593.9f , 205.2f)
                curveTo(593.9f , 199.6f , 591.7f , 194.5f , 588.1f , 190.7f)
                curveTo(588.2f , 189.8f , 588.3f , 189f , 588.3f , 188.1f)
                curveTo(588.3f , 181.5f , 585.2f , 175.6f , 580.5f , 171.8f)
                curveTo(580.6f , 170.8f , 580.7f , 169.9f , 580.7f , 168.9f)
                curveTo(580.7f , 167.4f , 580.5f , 165.9f , 580.2f , 164.5f)
                curveTo(580.5f , 163.1f , 580.7f , 161.6f , 580.7f , 160.1f)
                curveTo(580.7f , 153.5f , 577.6f , 147.5f , 572.8f , 143.7f)
                curveTo(572.3f , 139f , 570.2f , 134.9f , 567.1f , 131.6f)
                curveTo(565.9f , 121.3f , 557.3f , 113.3f , 546.8f , 113.1f)
                curveTo(542.9f , 108.7f , 537.3f , 105.8f , 530.9f , 105.8f)
                curveTo(528.5f , 105.8f , 526.2f , 106.2f , 524.1f , 107f)
                curveTo(521f , 105.2f , 517.3f , 104.1f , 513.5f , 104.1f)
                curveTo(509.6f , 104.1f , 506f , 105.2f , 502.9f , 107f)
                curveTo(500.8f , 106.3f , 498.5f , 105.9f , 496.2f , 105.9f)
                curveTo(486.7f , 105.9f , 478.7f , 112.2f , 476.1f , 120.8f)
                curveTo(468.2f , 122.5f , 462f , 128.6f , 460.1f , 136.5f)
                curveTo(453.4f , 140f , 448.7f , 147f , 448.7f , 155.1f)
                curveTo(448.7f , 157.1f , 449f , 159f , 449.5f , 160.8f)
                curveTo(447f , 164.3f , 445.5f , 168.5f , 445.5f , 173.1f)
                curveTo(445.5f , 175.2f , 445.8f , 177.3f , 446.4f , 179.2f)
                curveTo(441.5f , 183f , 438.4f , 189f , 438.4f , 195.7f)
                curveTo(438.4f , 200f , 439.7f , 204f , 442f , 207.4f)
                curveTo(441.9f , 210.9f , 442.7f , 214.3f , 444.2f , 217.2f)
                curveTo(435.6f , 223.9f , 432.2f , 237.3f , 442.2f , 249.4f)
                curveTo(450.9f , 256f , 460.6f , 256f , 467.6f , 251.9f)
                curveTo(470.7f , 253.7f , 474.3f , 254.7f , 478.1f , 254.7f)
                curveTo(487.8f , 254.7f , 495.9f , 248.1f , 498.4f , 239.2f)
            }
            path(
                fill = SolidColor(Color(0xFFFFA279)) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(479.8f , 202.5f)
                lineTo(515.1f , 247.7f)
                lineTo(533.8f , 217.3f)
                curveTo(533.8f , 217.3f , 539.8f , 210.2f , 544.4f , 202.5f)
                curveTo(549f , 194.7f , 544.4f , 171.8f , 544.4f , 171.8f)
                curveTo(544.4f , 171.8f , 540.2f , 164f , 533.1f , 140.2f)
                curveTo(533.1f , 140.2f , 523.2f , 149.6f , 509.1f , 152.4f)
                curveTo(495f , 155.2f , 475.9f , 190.5f , 479.8f , 202.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFF8B68)) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(505f , 230.3f)
                curveTo(507.8f , 231f , 539.7f , 230.9f , 533.8f , 217.3f)
                curveTo(533.8f , 217.3f , 518.6f , 231f , 488.3f , 219f)
                lineTo(505f , 230.3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0099FF)) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(488f , 213.1f)
                curveTo(488f , 213.1f , 495.6f , 223.6f , 511f , 231.2f)
                curveTo(511f , 231.2f , 518.4f , 239.7f , 519.7f , 238.8f)
                curveTo(521f , 237.9f , 525.7f , 225.2f , 525.7f , 225.2f)
                lineTo(533.8f , 217.4f)
                lineTo(550.6f , 239f)
                curveTo(550.6f , 239f , 555.2f , 246.5f , 552.9f , 254.5f)
                curveTo(550.6f , 262.4f , 528.7f , 266f , 528.7f , 266f)
                curveTo(528.7f , 266f , 509.3f , 268.6f , 497.3f , 258.6f)
                curveTo(485.3f , 248.5f , 480.7f , 227.9f , 480.7f , 227.9f)
                curveTo(480.7f , 227.9f , 479.1f , 217f , 488f , 213.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0070BB)) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(502.1f , 232.5f)
                curveTo(502.1f , 232.5f , 514.3f , 238.1f , 517.6f , 240.3f)
                curveTo(521f , 242.4f , 523.8f , 252.1f , 538.4f , 256.9f)
                curveTo(538.5f , 256.9f , 515.7f , 268.7f , 502.1f , 232.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFE8362)) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(545.9f , 180.6f)
                curveTo(543.2f , 159.4f , 543.9f , 175.5f , 533f , 138.2f)
                curveTo(518.5f , 150.4f , 491.7f , 151.2f , 482.6f , 184.5f)
                curveTo(484.7f , 183.2f , 493.1f , 168.8f , 508.6f , 160.6f)
                curveTo(520.8f , 154.1f , 521.7f , 158.4f , 530f , 150f)
                curveTo(530f , 150f , 544.4f , 177.4f , 546.3f , 187.2f)
                lineTo(545.9f , 180.6f)
                close()
            }
            
            path(
                fill = SolidColor(colorOnSecondary) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(271f , 315.9f)
                lineTo(251f , 331.8f)
                curveTo(247.9f , 334.2f , 243.5f , 333.7f , 241f , 330.7f)
                lineTo(225.1f , 310.8f)
                curveTo(222.7f , 307.7f , 223.2f , 303.3f , 226.2f , 300.8f)
                lineTo(246.1f , 284.9f)
                curveTo(249.2f , 282.5f , 253.6f , 283f , 256.1f , 286f)
                lineTo(272f , 305.9f)
                curveTo(274.6f , 309f , 274.1f , 313.5f , 271f , 315.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFF8161)) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(122.1f , 319.5f)
                lineTo(113.7f , 349.6f)
                lineTo(85.5f , 349.6f)
                lineTo(77.4f , 319.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCC664D)) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(77.4f , 319.5f)
                lineTo(79.9f , 328.9f)
                lineTo(122.1f , 319.5f)
                close()
            }
            path(
                fill = SolidColor(colorPrimaryContainer) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(105.3f , 111.6f)
                lineTo(90.9f , 134.3f)
                curveTo(89.6f , 136.3f , 86.8f , 136.8f , 84.7f , 135.5f)
                lineTo(73.6f , 128.5f)
                curveTo(66.2f , 123.8f , 63f , 114.3f , 67.2f , 107.2f)
                curveTo(71.5f , 99.9f , 81.5f , 97.9f , 89.1f , 102.7f)
                lineTo(91f , 103.9f)
                lineTo(91.6f , 103f)
                curveTo(93.8f , 99.5f , 98.7f , 98.6f , 102.4f , 101f)
                curveTo(106.3f , 103.3f , 107.5f , 108.1f , 105.3f , 111.6f)
                close()
                moveTo(98.5f , 113.7f)
                lineTo(92.7f , 110f)
                lineTo(81.2f , 128.1f)
                lineTo(87f , 131.8f)
                lineTo(98.5f , 113.7f)
                close()
                moveTo(88.8f , 107.5f)
                lineTo(86.9f , 106.3f)
                curveTo(81.5f , 102.9f , 74.6f , 104.2f , 71.4f , 109.2f)
                curveTo(68.2f , 114.2f , 70f , 121f , 75.4f , 124.4f)
                lineTo(77.3f , 125.6f)
                moveTo(95.6f , 105.4f)
                lineTo(95f , 106.3f)
                lineTo(100.8f , 110f)
                lineTo(101.4f , 109.1f)
                curveTo(102.4f , 107.6f , 101.8f , 105.6f , 100.2f , 104.5f)
                curveTo(98.6f , 103.6f , 96.5f , 103.9f , 95.6f , 105.4f)
                close()
                moveTo(57.5f , 118.2f)
                lineTo(75.9f , 89.2f)
                lineTo(72f , 86.7f)
                lineTo(53.6f , 115.7f)
                lineTo(57.5f , 118.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF729461)) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(92f , 302.4f)
                curveTo(87.8f , 297.2f , 87.2f , 285.7f , 85f , 277.3f)
                curveTo(84f , 273.4f , 81.4f , 270.3f , 78.1f , 268f)
                curveTo(72.3f , 264f , 67.7f , 251.4f , 62.1f , 244.6f)
                curveTo(58.7f , 240.5f , 52.6f , 239.8f , 48.6f , 243.3f)
                curveTo(40f , 250.7f , 62.6f , 259.2f , 63.4f , 272.4f)
                curveTo(57.6f , 286.3f , 71f , 296.3f , 81f , 302.2f)
                curveTo(85.9f , 304.9f , 88.9f , 317.2f , 93.4f , 317.5f)
                curveTo(91.6f , 307.8f , 80.3f , 294.6f , 74.5f , 286.2f)
                curveTo(73.4f , 284.6f , 72.8f , 282.6f , 72.8f , 280.6f)
                curveTo(72.7f , 266.4f , 54.8f , 263.2f , 54.1f , 247.5f)
                curveTo(56f , 254.2f , 73.7f , 270.2f , 74.1f , 279f)
                curveTo(74.2f , 281.3f , 75.1f , 283.4f , 76.4f , 285.3f)
                curveTo(80.9f , 291.5f , 89.4f , 298.7f , 91.2f , 305.4f)
                curveTo(93.1f , 322.8f , 96.8f , 314.7f , 93.6f , 305.7f)
                curveTo(93.3f , 304.4f , 92.7f , 303.3f , 92f , 302.4f)
                close()
                moveTo(93.5f , 317.6f)
                lineTo(93.5f , 317.5f)
                lineTo(93.5f , 317.6f)
                close()
                moveTo(149.9f , 243.8f)
                curveTo(146.3f , 228.4f , 132.2f , 243.4f , 135.6f , 252f)
                curveTo(136.6f , 258.3f , 128.5f , 264.3f , 121.8f , 268.5f)
                curveTo(117.9f , 271f , 115.2f , 275f , 114.5f , 279.6f)
                curveTo(112.6f , 292.1f , 111.2f , 311f , 105.3f , 316.5f)
                curveTo(113f , 321.2f , 123.5f , 294.2f , 130.4f , 289.6f)
                curveTo(146.9f , 278.6f , 132.5f , 276.1f , 145.3f , 258.6f)
                curveTo(149.7f , 252.8f , 150.3f , 247.5f , 149.9f , 243.8f)
                close()
                moveTo(137.7f , 263.5f)
                curveTo(138.8f , 268.5f , 127f , 281f , 127f , 281f)
                curveTo(122.8f , 289.4f , 117.4f , 311.5f , 107.6f , 316.6f)
                curveTo(114.9f , 309.2f , 120.3f , 290.4f , 124.3f , 281.6f)
                curveTo(125.9f , 283.4f , 139.8f , 261.6f , 135.8f , 259.4f)
                curveTo(136.4f , 258.7f , 139.4f , 247.3f , 145.5f , 243.2f)
                curveTo(145.4f , 243.2f , 136.5f , 258.5f , 137.7f , 263.5f)
                close()
                moveTo(108.6f , 226.7f)
                curveTo(108.5f , 221.9f , 108.9f , 215.7f , 109.9f , 209.9f)
                curveTo(108.3f , 199.4f , 94.5f , 185.5f , 89.1f , 197.1f)
                curveTo(87.2f , 201.2f , 87.4f , 206f , 89.4f , 210.1f)
                curveTo(91.8f , 214.9f , 94.9f , 222.1f , 93.3f , 230.8f)
                curveTo(73.5f , 277.2f , 97.5f , 264.9f , 100.3f , 315.1f)
                curveTo(106.5f , 288.1f , 93.5f , 271.4f , 102.9f , 243.6f)
                curveTo(103.3f , 242.3f , 103.4f , 240.9f , 103.3f , 239.6f)
                curveTo(100.6f , 219.5f , 91.5f , 221.6f , 100.1f , 198.9f)
                curveTo(97.5f , 206.6f , 108.8f , 244.3f , 103.4f , 256.4f)
                curveTo(102.4f , 258.6f , 101.9f , 261f , 102.1f , 263.4f)
                curveTo(103.5f , 278.7f , 110f , 302.9f , 101f , 315.7f)
                curveTo(108.9f , 307.5f , 119.3f , 251.1f , 111.2f , 236.7f)
                curveTo(109.4f , 233.6f , 108.7f , 230.2f , 108.6f , 226.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFF8161)) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(100.1f , 315.6f)
                lineTo(100.3f , 315.2f)
                lineTo(100.2f , 315.1f)
                lineTo(100.1f , 315.6f)
                close()
            }
            path(
                fill = SolidColor(colorSecondaryContainer) ,
                fillAlpha = 1.0f ,
                stroke = null ,
                strokeAlpha = 1.0f ,
                strokeLineWidth = 1.0f ,
                strokeLineCap = StrokeCap.Butt ,
                strokeLineJoin = StrokeJoin.Miter ,
                strokeLineMiter = 1.0f ,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(485.9f , 72.5f)
                curveTo(481.3f , 67.2f , 474.9f , 75f , 470.2f , 72.9f)
                curveTo(468.6f , 72.3f , 466.3f , 71.4f , 463.6f , 70.8f)
                curveTo(462.9f , 70.7f , 462.3f , 70.6f , 461.6f , 70.7f)
                curveTo(456.5f , 71.5f , 454.9f , 79f , 457.3f , 83.2f)
                curveTo(460.3f , 87.7f , 464.4f , 100.8f , 470.3f , 102.4f)
                curveTo(471.5f , 102.9f , 472.9f , 102.9f , 474.1f , 102.4f)
                curveTo(479.9f , 100.9f , 484.2f , 87.6f , 487.1f , 83.2f)
                curveTo(489f , 79.8f , 488.6f , 75.4f , 485.9f , 72.5f)
                close()
            }
        }.build()
    }
}

