package com.lygttpod.shape.enum

/**
 * <pre>
 *      @author : Allen
 *      e-mail  : lygttpod@163.com
 *      desc    :
 * </pre>
 */
enum class ShapeGradientType(val value: Int) {
    LINEAR(0),
    RADIAL(1),
    SWEEP(2);

    companion object {
        @JvmStatic
        fun fromValue(value: Int): ShapeGradientType {
            return values().find { it.value == value } ?: LINEAR
        }
    }
}