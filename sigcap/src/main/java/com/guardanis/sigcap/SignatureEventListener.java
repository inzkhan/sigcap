package com.guardanis.sigcap;

/**
 * An interface used for handling callbacks from the {@link android.content.DialogInterface}
 * actions set when integrating with a {@link SignatureInputView} via the
 * {@link com.guardanis.sigcap.dialog.SignatureDialogBuilder}
 */
public interface SignatureEventListener {

    /**
     * Called when the user submits their signature
     *
     * @param response the {@link SignatureResponse} containing the
     *      {@link android.graphics.Bitmap} generated from the collected
     *      {@link com.guardanis.sigcap.paths.SignaturePath} instances
     */
    public void onSignatureEntered(SignatureResponse response);

    /**
     * Called when the user cancels the {@link android.app.Dialog}
     * without submitting a {@link SignatureResponse}
     */
    public void onSignatureInputCanceled();

    /**
     * Called when the system encounters any form of error. If a user
     * attempts to submit a {@link SignatureResponse} with no
     * {@link com.guardanis.sigcap.paths.SignaturePath} data, it will
     * be called with a {@link com.guardanis.sigcap.exceptions.NoSignatureException}
     *
     * @param error whatever error has been thrown
     */
    public void onSignatureInputError(Throwable error);
}