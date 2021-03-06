package io.segment.android.flush;

import io.segment.android.utils.IThreadedLayer;

/**
 * Handles flushing to the server endpoint
 *
 */
public interface IFlushLayer extends IThreadedLayer {

	//
	// Callbacks
	//
	
	/**
	 * Callback for the #flush method
	 *
	 */
	public interface FlushCallback {
		/**
		 * Called when all messages have been flushed from the queue
		 * @param success True for successful flush, false for not. 
		 */
		public void onFlushCompleted(boolean success);
	}
	
	//
	// Methods
	//
	
	/**
	 * Called to flush the queue
	 * @param callback
	 */
	public void flush(FlushCallback callback);
	
	
}
