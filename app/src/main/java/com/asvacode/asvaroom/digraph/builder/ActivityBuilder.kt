package com.asvacode.asvaroom.digraph.builder

import com.asvacode.asvaroom.mvp.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cheasocheat on 3/18/18.
 */
@Module
abstract class ActivityBuilder{

    @ContributesAndroidInjector()
    abstract fun bindMainActivity(): MainActivity
}