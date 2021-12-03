package com.yes.project.module

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter




@Route(path = "/splash/activity")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        BuildConfig.FLAVOR
        val umeng_channel_value = packageManager.getApplicationInfo(
            packageName,
            PackageManager.GET_META_DATA
        ).metaData.getString("UMENG_APPKEY")
        Log.e(this::javaClass.name, "??? -- $umeng_channel_value")
    }


    fun jumpBase(view: View) {
        ARouter.getInstance().build("/project/base")
            .withString("key1", "222222222222222222222")
            .navigation()
    }
}