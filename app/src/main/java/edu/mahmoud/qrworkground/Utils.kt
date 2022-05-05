package edu.mahmoud.qrworkground

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager


fun openFragment(manager:FragmentManager , containerId:Int ,fragment:Fragment, addTOBack:Boolean = false){
    val tag = fragment::class.java.name
    manager.beginTransaction()
        .add(containerId, fragment)
        .apply { if (addTOBack) addToBackStack(tag) }
        .commit()
}