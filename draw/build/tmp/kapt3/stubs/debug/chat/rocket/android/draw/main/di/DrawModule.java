package chat.rocket.android.draw.main.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\u000f"}, d2 = {"Lchat/rocket/android/draw/main/di/DrawModule;", "", "()V", "provideCancelStrategy", "Lchat/rocket/android/core/lifecycle/CancelStrategy;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "jobs", "Lkotlinx/coroutines/Job;", "provideJob", "provideLifecycleOwner", "activity", "Lchat/rocket/android/draw/main/ui/DrawingActivity;", "provideMainView", "Lchat/rocket/android/draw/main/presenter/DrawView;", "draw_debug"})
@dagger.Module()
public final class DrawModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final chat.rocket.android.draw.main.presenter.DrawView provideMainView(@org.jetbrains.annotations.NotNull()
    chat.rocket.android.draw.main.ui.DrawingActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final kotlinx.coroutines.Job provideJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.lifecycle.LifecycleOwner provideLifecycleOwner(@org.jetbrains.annotations.NotNull()
    chat.rocket.android.draw.main.ui.DrawingActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final chat.rocket.android.core.lifecycle.CancelStrategy provideCancelStrategy(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job jobs) {
        return null;
    }
    
    public DrawModule() {
        super();
    }
}