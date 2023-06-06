package com.example.pager2

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2.ORIENTATION_HORIZONTAL
import androidx.viewpager2.widget.ViewPager2.ORIENTATION_VERTICAL
import com.example.pager2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    class MyAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

        private val resources = listOf(
            R.drawable.slide00, R.drawable.slide01,
            R.drawable.slide02, R.drawable.slide03,
            R.drawable.slide04, R.drawable.slide05,
            R.drawable.slide06, R.drawable.slide07,
            R.drawable.slide08, R.drawable.slide09
        )

        override fun getItemCount(): Int = resources.size

        override fun createFragment(position: Int): Fragment
            = ImageFragment.newInstance(resources[position])
    }

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pager.adapter = MyAdapter(this)

        val button = intent.getIntExtra("BUTTON", 0)

        when (button) {
            R.id.horizontalButton -> binding.pager.orientation = ORIENTATION_HORIZONTAL
            R.id.verticalButton -> binding.pager.orientation = ORIENTATION_VERTICAL

        }


    }

}