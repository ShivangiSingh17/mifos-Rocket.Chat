package chat.rocket.android.draw.dagger.module;

import android.app.Activity;
import chat.rocket.android.draw.main.di.DrawModule;
import chat.rocket.android.draw.main.ui.DrawingActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeDrawingActivityInjector.DrawingActivitySubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeDrawingActivityInjector {
  private ActivityBuilderModule_ContributeDrawingActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(DrawingActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      DrawingActivitySubcomponent.Builder builder);

  @Subcomponent(modules = DrawModule.class)
  public interface DrawingActivitySubcomponent extends AndroidInjector<DrawingActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DrawingActivity> {}
  }
}
