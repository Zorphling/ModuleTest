package com.yes.project.base

import android.os.Bundle
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Route

/**
 * @author Morphling
 */
@Route(path = "/project/base")
class Bactivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.base_activity_b)
        intent?.getStringExtra("data")?.let {
            findViewById<TextView>(R.id.tv_data).text = it
        }
        intent.getStringExtra("key1")?.let {
            findViewById<TextView>(R.id.tv_data).text = it
        }
    }
}