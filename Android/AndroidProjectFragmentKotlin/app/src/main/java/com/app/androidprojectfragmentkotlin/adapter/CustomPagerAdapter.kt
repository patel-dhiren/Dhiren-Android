package com.app.androidprojectfragmentkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.app.androidprojectfragmentkotlin.databinding.ItemOnboardingLayoutBinding
import com.app.androidprojectfragmentkotlin.model.Item

class CustomPagerAdapter(var context: Context, var itemList:MutableList<Item>) : PagerAdapter(){

    private lateinit var binding:ItemOnboardingLayoutBinding

    override fun getCount(): Int {
        return itemList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        var item = itemList[position]
        binding = ItemOnboardingLayoutBinding.inflate(LayoutInflater.from(context), container, false)

        binding.tvTitle.text = item.title
        binding.tvDesc.text = item.desc
        binding.ivThumbnail.setImageResource(item.image)

        container.addView(binding.root)
        return binding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}