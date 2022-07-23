package com.app.androidprojectfragmentkotlin.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.app.androidprojectfragmentkotlin.R
import com.app.androidprojectfragmentkotlin.adapter.CustomPagerAdapter
import com.app.androidprojectfragmentkotlin.databinding.ActivityIntroBinding
import com.app.androidprojectfragmentkotlin.model.Item

class IntroActivity : AppCompatActivity() {

    private lateinit var binding:ActivityIntroBinding
    private var itemList = mutableListOf<Item>()
    private lateinit var adapter:CustomPagerAdapter
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prepareData()
        // pass data to adapter using adapterview
        adapter = CustomPagerAdapter(this, itemList)
        binding.viewPager.adapter = adapter

        updateIndicator(currentIndex)

        binding.btnNext.setOnClickListener {

            if(currentIndex<adapter.count-1){
                currentIndex++
                binding.viewPager.currentItem = currentIndex
            }else{
                // navigate to login activity
                startActivity(Intent(applicationContext, AuthActivity::class.java))
            }

        }

        binding.viewPager.addOnPageChangeListener(object:ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                currentIndex = position

                if(currentIndex == adapter.count-1){
                    // last page
                    binding.btnNext.text = "Finish"
                    binding.btnSkip.visibility = View.GONE
                    binding.btnNext.icon = null
                }else{
                    binding.btnNext.text = "Next"
                    binding.btnSkip.visibility = View.VISIBLE
                    binding.btnNext.icon = ContextCompat.getDrawable(applicationContext, R.drawable.ic_baseline_arrow_forward_24)
                }

                updateIndicator(currentIndex)

                //Toast.makeText(applicationContext, "$position", Toast.LENGTH_SHORT).show()
            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })

    }

    private fun updateIndicator(index: Int) {

        binding.indicatorDots.removeAllViews()

        var indicators = arrayOfNulls<ImageView>(3)

        for( i in indicators.indices){
            indicators[i] = ImageView(this)

            if(i==index){
                indicators[i]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.active_indicator))
            }else{
                indicators[i]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.inactive_indicator))
            }

            var param = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            param.setMargins(20, 0,0,0)

            binding.indicatorDots.addView(indicators[i], param)
        }


    }

    private fun prepareData() {
        itemList.add(Item(1, "Fresh Food", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eu auctor mauris. Vestibulum vestibulum, purus nec imperdiet accumsan,", R.drawable.onboarding1))
        itemList.add(Item(2, "Fast Delivery", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eu auctor mauris. Vestibulum vestibulum, purus nec imperdiet accumsan,", R.drawable.onboarding2))
        itemList.add(Item(3, "Easy Payment", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eu auctor mauris. Vestibulum vestibulum, purus nec imperdiet accumsan,", R.drawable.onboarding3))
    }
}