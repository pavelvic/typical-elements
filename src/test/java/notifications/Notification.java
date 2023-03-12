package notifications;

import annotation.FindByParametrised;
import htmlelements.MatNotifModal;
import htmlelements.MatNotifPopup;

public class Notification {

    @FindByParametrised(param1 = "notification__header_error")
    public MatNotifModal errorModal;

    @FindByParametrised (param1 = "notification__header_success")
    public MatNotifModal successModal;

    @FindByParametrised(param1 = "notification-popup__header_success")
    public MatNotifPopup successPopup;
}
