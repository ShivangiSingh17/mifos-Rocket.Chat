package chat.rocket.android.draw.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0002J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0016\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0010J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u0010H\u0002J\u0006\u0010(\u001a\u00020\u001eJ\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0014J0\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00012\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001e03J\u0006\u00104\u001a\u00020\u001eJ\u000e\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u000207J\u000e\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u000207J\u000e\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\bJ\u0006\u0010<\u001a\u00020\u001eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lchat/rocket/android/draw/widget/CustomDrawView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mCurX", "", "mCurY", "mIsSaving", "", "mIsStrokeWidthBarEnabled", "mLastPaths", "Ljava/util/LinkedHashMap;", "Lchat/rocket/android/draw/widget/MyPath;", "Lchat/rocket/android/draw/widget/PaintOptions;", "mPaint", "Landroid/graphics/Paint;", "mPaintOptions", "mPath", "mPaths", "getMPaths", "()Ljava/util/LinkedHashMap;", "setMPaths", "(Ljava/util/LinkedHashMap;)V", "mStartX", "mStartY", "mUndonePaths", "actionDown", "", "x", "y", "actionMove", "actionUp", "addPath", "path", "options", "changePaint", "paintOptions", "clearCanvas", "getBitmap", "Landroid/graphics/Bitmap;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouch", "event", "Landroid/view/MotionEvent;", "drawTools", "toggleDrawTools", "Lkotlin/Function2;", "redo", "setAlpha", "newAlpha", "", "setColor", "newColor", "setStrokeWidth", "newStrokeWidth", "undo", "draw_debug"})
public final class CustomDrawView extends android.view.View {
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<chat.rocket.android.draw.widget.MyPath, chat.rocket.android.draw.widget.PaintOptions> mPaths;
    private java.util.LinkedHashMap<chat.rocket.android.draw.widget.MyPath, chat.rocket.android.draw.widget.PaintOptions> mLastPaths;
    private java.util.LinkedHashMap<chat.rocket.android.draw.widget.MyPath, chat.rocket.android.draw.widget.PaintOptions> mUndonePaths;
    private android.graphics.Paint mPaint;
    private chat.rocket.android.draw.widget.MyPath mPath;
    private chat.rocket.android.draw.widget.PaintOptions mPaintOptions;
    private float mCurX;
    private float mCurY;
    private float mStartX;
    private float mStartY;
    private boolean mIsSaving;
    private boolean mIsStrokeWidthBarEnabled;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<chat.rocket.android.draw.widget.MyPath, chat.rocket.android.draw.widget.PaintOptions> getMPaths() {
        return null;
    }
    
    public final void setMPaths(@org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<chat.rocket.android.draw.widget.MyPath, chat.rocket.android.draw.widget.PaintOptions> p0) {
    }
    
    public final void undo() {
    }
    
    public final void redo() {
    }
    
    public final void setColor(int newColor) {
    }
    
    public final void setAlpha(int newAlpha) {
    }
    
    public final void setStrokeWidth(float newStrokeWidth) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getBitmap() {
        return null;
    }
    
    public final void addPath(@org.jetbrains.annotations.NotNull()
    chat.rocket.android.draw.widget.MyPath path, @org.jetbrains.annotations.NotNull()
    chat.rocket.android.draw.widget.PaintOptions options) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void changePaint(chat.rocket.android.draw.widget.PaintOptions paintOptions) {
    }
    
    public final void clearCanvas() {
    }
    
    private final void actionDown(float x, float y) {
    }
    
    private final void actionMove(float x, float y) {
    }
    
    private final void actionUp() {
    }
    
    public final boolean onTouch(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event, @org.jetbrains.annotations.NotNull()
    android.view.View drawTools, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super android.view.View, ? super java.lang.Boolean, kotlin.Unit> toggleDrawTools) {
        return false;
    }
    
    public CustomDrawView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
}