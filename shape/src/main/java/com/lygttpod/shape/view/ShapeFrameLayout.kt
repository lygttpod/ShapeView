package com.lygttpod.shape.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.FrameLayout
import com.lygttpod.shape.data.AttributeSetData
import com.lygttpod.shape.helper.AttributeSetHelper
import com.lygttpod.shape.helper.ShadowHelper
import com.lygttpod.shape.helper.ShapeBuilder

/**
 * <pre>
 *      @author : Allen
 *      e-mail  : lygttpod@163.com
 *      desc    :
 * </pre>
 */
class ShapeFrameLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {
    var shapeBuilder: ShapeBuilder? = null
    var shadowHelper: ShadowHelper? = null

    var attributeSetData: AttributeSetData = AttributeSetData()

    init {
        attributeSetData = AttributeSetHelper().loadFromAttributeSet(context, attrs)
        if (attributeSetData.showShadow) {
            shadowHelper = ShadowHelper()
            shadowHelper?.init(this, attributeSetData)
        } else {
            shapeBuilder = ShapeBuilder()
            shapeBuilder?.init(this, attributeSetData)
        }
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        shadowHelper?.onSizeChanged(w, h)
    }

    override fun dispatchDraw(canvas: Canvas) {
        shadowHelper?.drawBefore(canvas)
        super.dispatchDraw(canvas)
        shadowHelper?.drawOver(canvas)
    }
}