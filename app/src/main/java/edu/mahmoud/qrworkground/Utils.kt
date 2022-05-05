package edu.mahmoud.qrworkground

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager


fun openFragment(manager:FragmentManager , fragment:Fragment){
    manager.beginTransaction()
        .add(fragment , fragment::class.java.name)
        .addToBackStack(fragment::class.java.name)
        .commit()
}