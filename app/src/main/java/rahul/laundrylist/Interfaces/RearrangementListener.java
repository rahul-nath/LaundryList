package rahul.laundrylist.Interfaces;

/**
 * Created by rahul on 9/28/14.
 */
public interface RearrangementListener {
    public void onStartedRearranging();
    public void swapElements(int indexOne, int indexTwo);
    public void onFinishedRearranging();
}
