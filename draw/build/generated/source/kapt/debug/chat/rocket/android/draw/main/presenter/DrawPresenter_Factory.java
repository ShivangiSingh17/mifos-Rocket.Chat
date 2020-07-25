// Generated by Dagger (https://google.github.io/dagger).
package chat.rocket.android.draw.main.presenter;

import chat.rocket.android.core.lifecycle.CancelStrategy;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DrawPresenter_Factory implements Factory<DrawPresenter> {
  private final Provider<DrawView> viewProvider;

  private final Provider<CancelStrategy> strategyProvider;

  public DrawPresenter_Factory(
      Provider<DrawView> viewProvider, Provider<CancelStrategy> strategyProvider) {
    this.viewProvider = viewProvider;
    this.strategyProvider = strategyProvider;
  }

  @Override
  public DrawPresenter get() {
    return provideInstance(viewProvider, strategyProvider);
  }

  public static DrawPresenter provideInstance(
      Provider<DrawView> viewProvider, Provider<CancelStrategy> strategyProvider) {
    return new DrawPresenter(viewProvider.get(), strategyProvider.get());
  }

  public static DrawPresenter_Factory create(
      Provider<DrawView> viewProvider, Provider<CancelStrategy> strategyProvider) {
    return new DrawPresenter_Factory(viewProvider, strategyProvider);
  }

  public static DrawPresenter newDrawPresenter(DrawView view, CancelStrategy strategy) {
    return new DrawPresenter(view, strategy);
  }
}
