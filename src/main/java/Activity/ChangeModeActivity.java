package Activity;

import player.Player;
import player.PlayerMode;

import java.rmi.RemoteException;

public class ChangeModeActivity extends Activity  {
    public ChangeModeActivity(Player p) {
        super(p);
    }

    @Override
    public void actiby() throws RemoteException {

       super.getPlayer().changeMode();

    }
}
