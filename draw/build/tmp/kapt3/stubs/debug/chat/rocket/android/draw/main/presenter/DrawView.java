package chat.rocket.android.draw.main.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lchat/rocket/android/draw/main/presenter/DrawView;", "", "sendByteArray", "", "byteArray", "", "showWrongProcessingMessage", "draw_debug"})
public abstract interface DrawView {
    
    /**
     * Sends the [ByteArray] of the processed draw image (compressed).
     */
    public abstract void sendByteArray(@org.jetbrains.annotations.NotNull()
    byte[] byteArray);
    
    /**
     * Shows a message indicating that something was wrong while processing the draw image.
     */
    public abstract void showWrongProcessingMessage();
}