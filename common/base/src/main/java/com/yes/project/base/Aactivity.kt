package com.yes.project.base

import android.content.Intent
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route

/**
 * @author Morphling
 */

class Aactivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.base_activity_a)
        startActivity(Intent(this,Bactivity::class.java).apply {
            putExtra("data","123123123123131321321321312")
        })
        finish()
    }
}