package com.force.codes.kotlinreyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = MainFragment
            .newInstance("user1", "password123")

        supportFragmentManager.transaction {
            replace(R.id.fragment_container, fragment)
        }
    }

    private inline fun FragmentManager.transaction(
        func: FragmentTransaction.() -> FragmentTransaction
    ) {
        beginTransaction().func().commit()
    }
}
