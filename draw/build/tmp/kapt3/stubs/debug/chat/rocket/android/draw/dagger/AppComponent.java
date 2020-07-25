package chat.rocket.android.draw.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lchat/rocket/android/draw/dagger/AppComponent;", "Ldagger/android/AndroidInjector;", "Ldagger/android/support/DaggerApplication;", "Builder", "draw_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, chat.rocket.android.draw.dagger.module.ActivityBuilderModule.class})
public abstract interface AppComponent extends dagger.android.AndroidInjector<dagger.android.support.DaggerApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lchat/rocket/android/draw/dagger/AppComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Ldagger/android/support/DaggerApplication;", "()V", "draw_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<dagger.android.support.DaggerApplication> {
        
        public Builder() {
            super();
        }
    }
}