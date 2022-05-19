package com.android.shapeview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.graphics.alpha
import com.android.shapeview.databinding.ActivityMainBinding
import com.lygttpod.shape.enum.ShapeType
import com.lygttpod.shape.helper.ShapeBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shapeTextView.setOnClickListener {

            binding.shapeTextView.shapeBuilder?.let {
                it.setShapeType(ShapeType.RECTANGLE)
                    .setShapeSolidColor(
                        Color.rgb(
                            (255 * Math.random()).toInt(),
                            (255 * Math.random()).toInt(),
                            (255 * Math.random()).toInt()
                        )
                    )
                    .setShapeStrokeColor(
                        Color.rgb(
                            (255 * Math.random()).toInt(),
                            (255 * Math.random()).toInt(),
                            (255 * Math.random()).toInt()
                        )
                    )
                    .setShapeStrokeWidth(2)
                    .setShapeCornersRadius(30f)
                    .into(binding.shapeTextView)
            }
        }
    }

    /**
     * 如果ShapeXXXView无法满足你的布局需求可以，使用ShapeBuilder对任何view设置shape属性
     * 用法如下：
     *          normalShape.into("你的任意View")
     */
    private val normalShape: ShapeBuilder
        get() = ShapeBuilder()
            .setShapeType(ShapeType.RECTANGLE)
            .setShapeSolidColor(resources.getColor(R.color.colorAccent))
            .setShapeStrokeColor(resources.getColor(R.color.colorPrimary))
            .setShapeStrokeWidth(2)
            .setShapeCornersRadius(30f)
}