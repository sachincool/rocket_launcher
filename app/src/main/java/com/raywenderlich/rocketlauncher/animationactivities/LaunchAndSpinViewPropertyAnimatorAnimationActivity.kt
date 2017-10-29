package com.raywenderlich.rocketlauncher.animationactivities

class LaunchAndSpinViewPropertyAnimatorAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    rocket.animate()
            .translationY(-screenHeight)
            .rotationBy(360f)
            .setDuration(BaseAnimationActivity.Companion.DEFAULT_ANIMATION_DURATION)
            .start()  }
}
