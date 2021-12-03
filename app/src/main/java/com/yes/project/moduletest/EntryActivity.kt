package com.yes.project.moduletest

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

@Route(path = "/entry/main" )
class EntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_dwnajdnjawd)
        Handler().postDelayed({
            ARouter.getInstance().build("/splash/activity").withString("key1","111111111111111111").navigation()
//            startActivity(Intent(this, SplashActivity::class.java))
            finish()
        },1000)

    }
}