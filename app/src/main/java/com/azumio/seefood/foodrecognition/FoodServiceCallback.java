package com.azumio.seefood.foodrecognition;

import org.json.JSONObject;

/**
 * Created by azumio.azumio
 */

public interface FoodServiceCallback<T> {

    /**
     * Indicates that the upload operation has finished. This method is called even if the
     * upload hasn't completed successfully.
     */
    void finishRecognition(JSONObject response, FoodRecognitionException exception);
}
