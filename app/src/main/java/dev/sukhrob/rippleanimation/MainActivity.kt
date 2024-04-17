package dev.sukhrob.rippleanimation

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import dev.sukhrob.rippleanimation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rippleBackground.startRippleAnimation()
    }

    private fun foundDevice() {
//        val animatorSet = AnimatorSet()
//        animatorSet.setDuration(400)
//        animatorSet.interpolator = AccelerateDecelerateInterpolator()
//        val animatorList = ArrayList<Animator>()
//        val scaleXAnimator = ObjectAnimator.ofFloat(binding.foundDevice, "ScaleX", 0f, 1.2f, 1f)
//        animatorList.add(scaleXAnimator)
//        val scaleYAnimator = ObjectAnimator.ofFloat(binding.foundDevice, "ScaleY", 0f, 1.2f, 1f)
//        animatorList.add(scaleYAnimator)
//        animatorSet.playTogether(animatorList)
//        binding.foundDevice.setVisibility(View.VISIBLE)
//        animatorSet.start()
    }

//    foundDevice=(ImageView)findViewById(R.id.foundDevice);
//    ImageView button=(ImageView)findViewById(R.id.centerImage);
//    button.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            rippleBackground.startRippleAnimation();
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    foundDevice();
//                }
//            },3000);
//        }
//    });
}