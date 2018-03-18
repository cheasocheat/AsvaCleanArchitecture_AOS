package com.asvacode.asvaroom.digraph.component

import com.asvacode.asvaroom.application.AsvaApplication
import com.asvacode.asvaroom.digraph.builder.ActivityBuilder
import com.asvacode.asvaroom.digraph.module.AppDatabaseModule
import com.asvacode.asvaroom.digraph.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by cheasocheat on 3/18/18.
 */
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBuilder::class,
    AppDatabaseModule::class
])
@Singleton
interface AppComponent{

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: AsvaApplication): Builder
        fun build(): AppComponent
    }

    fun inject(application: AsvaApplication)
}