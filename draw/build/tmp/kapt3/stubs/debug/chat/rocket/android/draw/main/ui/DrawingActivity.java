package chat.rocket.android.draw.main.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\u001a\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020!H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lchat/rocket/android/draw/main/ui/DrawingActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "Lchat/rocket/android/draw/main/presenter/DrawView;", "()V", "presenter", "Lchat/rocket/android/draw/main/presenter/DrawPresenter;", "getPresenter", "()Lchat/rocket/android/draw/main/presenter/DrawPresenter;", "setPresenter", "(Lchat/rocket/android/draw/main/presenter/DrawPresenter;)V", "toPx", "", "", "getToPx", "(I)F", "colorSelector", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "scaleColorView", "view", "Landroid/view/View;", "sendByteArray", "byteArray", "", "setPaintAlpha", "setPaintWidth", "setupDrawTools", "setupListeners", "showWrongProcessingMessage", "toggleCompleteDrawTools", "showView", "", "toggleDrawTools", "draw_debug"})
public final class DrawingActivity extends dagger.android.support.DaggerAppCompatActivity implements chat.rocket.android.draw.main.presenter.DrawView {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public chat.rocket.android.draw.main.presenter.DrawPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.android.draw.main.presenter.DrawPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    chat.rocket.android.draw.main.presenter.DrawPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void sendByteArray(@org.jetbrains.annotations.NotNull()
    byte[] byteArray) {
    }
    
    @java.lang.Override()
    public void showWrongProcessingMessage() {
    }
    
    private final void setupListeners() {
    }
    
    private final void setupDrawTools() {
    }
    
    private final void toggleDrawTools(android.view.View view, boolean showView) {
    }
    
    private final void toggleCompleteDrawTools(android.view.View view, boolean showView) {
    }
    
    private final void colorSelector() {
    }
    
    private final void scaleColorView(android.view.View view) {
    }
    
    private final void setPaintWidth() {
    }
    
    private final void setPaintAlpha() {
    }
    
    private final float getToPx(int $this$toPx) {
        return 0.0F;
    }
    
    public DrawingActivity() {
        super();
    }
}