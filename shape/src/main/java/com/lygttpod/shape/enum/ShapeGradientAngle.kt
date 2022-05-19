package com.lygttpod.shape.enum

/**
 * <pre>
 *      @author : Allen
 *      e-mail  : lygttpod@163.com
 *      desc    :
 * </pre>
 */
enum class ShapeGradientAngle(val value: Int) {
    LEFT_RIGHT(0),
    BL_TR(45),
    BOTTOM_TOP(90),
    BR_TL(135),
    RIGHT_LEFT(180),
    TR_BL(225),
    TOP_BOTTOM(270),
    TL_BR(315);

    companion object {
        @JvmStatic
        fun fromValue(value: Int): ShapeGradientAngle {
            return ShapeGradientAngle.values().find { it.value == value } ?: LEFT_RIGHT
        }
    }
}