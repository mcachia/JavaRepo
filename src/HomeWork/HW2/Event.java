package HomeWork.HW2;

import java.time.LocalDateTime;

/**
 In pegasus we capture events: PAC event, PMC event, bank transfer event, etc
 every one of those we have to store in db eventually for audit
 some events are financial related (like the ones listed above)
 other events are not of a financial nature eg  let’s say: new currency rate event
 all events have a date/time when they happened
 bank transfer events have a branch name
 PAC/PMC events have a card number but PMC also has a currency
 */

public abstract class Event {

 private LocalDateTime dateTime;

 public LocalDateTime getDateTime() {
  return dateTime;
 }

 public void setDateTime(LocalDateTime dateTime) {
  this.dateTime = dateTime;
 }


}
