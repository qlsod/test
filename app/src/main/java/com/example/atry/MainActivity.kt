package com.example.atry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.atry.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val profiles = arrayListOf(
            Profiles("1번 사용자", "User No : 1"),
            Profiles("2번 사용자", "User No : 2"),
            Profiles("3번 사용자", "User No : 3"),
            Profiles("4번 사용자", "User No : 4"),
            Profiles("5번 사용자", "User No : 5"),
            Profiles("6번 사용자", "User No : 6"),
            Profiles("7번 사용자", "User No : 7"),
            Profiles("8번 사용자", "User No : 8"),
            Profiles("9번 사용자", "User No : 9"),
            Profiles("10번 사용자", "User No : 10"),
            Profiles("11번 사용자", "User No : 11"),
            Profiles("12번 사용자", "User No : 12"),
            Profiles("13번 사용자", "User No : 13"),
            Profiles("14번 사용자", "User No : 14"),
            Profiles("15번 사용자", "User No : 15"),
            Profiles("16번 사용자", "User No : 16"),
            Profiles("17번 사용자", "User No : 17"),
            Profiles("18번 사용자", "User No : 18"),
            Profiles("19번 사용자", "User No : 19"),
            Profiles("20번 사용자", "User No : 20")
        )

        val adapter = ProfileAdapter(profiles)

        binding.recyclerProfile.adapter = adapter
        binding.recyclerProfile.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerProfile.setHasFixedSize (true)

        val dividerItemDecoration = DividerItemDecoration(binding.recyclerProfile.context,
            LinearLayoutManager(this).orientation)
        binding.recyclerProfile.addItemDecoration(dividerItemDecoration);

    }


}

