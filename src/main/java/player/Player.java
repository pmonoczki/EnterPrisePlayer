package player;

import writer.Writer;

import java.rmi.RemoteException;

enum PlayerMode{
    CD,
        Spotify
 }

public class Player {

    private Writer writer;

    private PlayerMode pm;

    public Player() {
        pm = PlayerMode.Spotify;
    }

    public void stop(){

    }

    public void prev(){

    }

    public void next(){

    }

    public void start() throws RemoteException {

        if (pm == PlayerMode.CD) {

            writer.write("stared");
        }
        else{
            Client c = new Client();
            writer.write(c.getSong().toString());
        }
    }

    public PlayerMode getPm() {
        return pm;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
}
