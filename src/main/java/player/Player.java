package player;

import CD.CD;
import writer.Writer;

import java.rmi.RemoteException;



public class Player {

    private CD cd;

    public void addCD(CD cd){

    }

    private Writer writer;

    private PlayerMode pm;

    public Player() {
        pm = PlayerMode.Spotify;
    }

    public void changeMode(){

        if(this.pm == PlayerMode.CD){
            this.pm = PlayerMode.Spotify;
        }
        else{
            this.pm = PlayerMode.CD;
        }

    }

    public void stop(){

        this.writer.write("stopped");

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
