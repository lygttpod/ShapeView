package com.lygttpod.shape.enum

/**
 * <pre>
 *      @author : Allen
 *      e-mail  : lygttpod@163.com
 *      desc    :
 * </pre>
 */
enum class ShapeType(val value: Int) {
    RECTANGLE(0),
    OVAL(1),
    LINE(2),
    RING(3);

    companion object {
        @JvmStatic
        fun fromValue(value: Int): ShapeType {
            return ShapeType.values().find { it.value == value } ?: RECTANGLE
        }
    }
}