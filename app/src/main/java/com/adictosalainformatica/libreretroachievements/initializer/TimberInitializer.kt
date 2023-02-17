package com.adictosalainformatica.libreretroachievements.initializer

import android.content.Context
import androidx.startup.Initializer
import com.adictosalainformatica.libreretroachievements.BuildConfig
import timber.log.Timber

class TimberInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        Timber.d("Timber is initialized.")
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}
