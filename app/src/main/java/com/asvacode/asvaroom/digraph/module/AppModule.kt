package com.asvacode.asvaroom.digraph.module

import android.content.Context
import com.asvacode.asvaroom.application.AsvaApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by cheasocheat on 3/18/18.
 */
@Module
@Singleton
class AppModule{

    @Provides
    fun provideApplicationContext(app : AsvaApplication) : Context = app.applicationContext
}