// Generated by Dagger (https://google.github.io/dagger).
package chat.rocket.android.draw.main.di;

import chat.rocket.android.draw.main.presenter.DrawView;
import chat.rocket.android.draw.main.ui.DrawingActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DrawModule_ProvideMainViewFactory implements Factory<DrawView> {
  private final DrawModule module;

  private final Provider<DrawingActivity> activityProvider;

  public DrawModule_ProvideMainViewFactory(
      DrawModule module, Provider<DrawingActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public DrawView get() {
    return provideInstance(module, activityProvider);
  }

  public static DrawView provideInstance(
      DrawModule module, Provider<DrawingActivity> activityProvider) {
    return proxyProvideMainView(module, activityProvider.get());
  }

  public static DrawModule_ProvideMainViewFactory create(
      DrawModule module, Provider<DrawingActivity> activityProvider) {
    return new DrawModule_ProvideMainViewFactory(module, activityProvider);
  }

  public static DrawView proxyProvideMainView(DrawModule instance, DrawingActivity activity) {
    return Preconditions.checkNotNull(
        instance.provideMainView(activity),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
