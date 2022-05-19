package com.lygttpod.shape.view

import android.content.Context
import android.util.AttributeSet
import com.lygttpod.shape.data.AttributeSetData
import com.lygttpod.shape.helper.AttributeSetHelper
import com.lygttpod.shape.helper.ShapeBuilder

/**
 * <pre>
 *      @author : Allen
 *      e-mail  : lygttpod@163.com
 *      desc    :
 * </pre>
 */
class ShapeCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : androidx.cardview.widget.CardView(context, attrs, defStyleAttr) {
    var shapeBuilder: ShapeBuilder? = null
    var attributeSetData: AttributeSetData = AttributeSetData()

    init {
        attributeSetData = AttributeSetHelper().loadFromAttributeSet(context, attrs)
        shapeBuilder = ShapeBuilder()
        shapeBuilder?.init(this, attributeSetData)
    }
}