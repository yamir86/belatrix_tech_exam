package com.farina.yamir.stepper.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.farina.yamir.stepper.views.VerticalStepperItemView;

/**
 * Base interface providing the adapter to populate steps inside of
 * a {@link IStepperAdapter}.
 */
public interface IStepperAdapter {

    /**
     * This method will be called by the VerticalStepperView to obtain a title string
     * to describe the title of specified step. The string cannot be null.
     *
     * @param index The index of the title requested
     * @return A title for the requested step
     */
    @NonNull CharSequence getTitle(int index);

    /**
     * This method may be called by the VerticalStepperView to obtain a title string
     * to describe the summary of specified step. It may return null indicating
     * no summary for this step.
     *
     * @param index The index of the summary requested
     * @return A summary for the requested step
     */
    @Nullable CharSequence getSummary(int index);

    /**
     * Get the count of steppers
     *
     * @return The size of adapter
     */
    int size();

    /**
     * When the specified step need a custom view, this method will be called
     * for creating custom view. The returned view will be added to ItemView.
     *
     * @param index Index
     * @param context Context
     * @param parent Vertical Stepper Item View
     * @return The custom view created
     */
    View onCreateCustomView(int index, Context context, VerticalStepperItemView parent);

    /**
     * This method will be called when a stepper is showed.
     *
     * @param index The index of stepper showed
     */
    void onShow(int index);

    /**
     * This method will be called when a stepper is hidden.
     *
     * @param index The index of stepper hidden
     */
    void onHide(int index);

}