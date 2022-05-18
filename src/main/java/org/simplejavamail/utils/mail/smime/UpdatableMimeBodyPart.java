package org.simplejavamail.utils.mail.smime;

import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;

/**
 * A {@link MimeBodyPart} that exposes the method {@code updateHeaders()} with
 * {@code public} visibility.
 * 
 * @author Allen Petersen (akp at sourceforge dot net)
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 1.0.0
 */
class UpdatableMimeBodyPart extends MimeBodyPart {

	/**
	 * Calls updateHeaders().
	 */
	public void updateHeaders() throws MessagingException {
		super.updateHeaders();
	}

}
