package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.AccelerateInterpolator

class AccelerateRocketAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    // 1
    val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)
    valueAnimator.addUpdateListener {
      val value = it.animatedValue as Float
      rocket.translationY = value
    }

// 2 - Here set your favorite interpolator
    valueAnimator.interpolator = AccelerateInterpolator(1.5f)
    valueAnimator.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION

// 3
    valueAnimator.start()
  }
}
