package sample.backend;

import javax.smartcardio.*;
import java.util.Arrays;
import java.util.List;

public class NfcCard {
    private int cardHash;
    private int cardID;

    NfcCard(int cardHash){
        this.cardHash = cardHash;
        //this.cardID = searchFunction;
    }

    public long getCardHash() {
        return cardHash;
    }

    public void setCardHash(int cardHash) {
        this.cardHash = cardHash;
    }

    public int getCardID() {
        // find hash in DB
        //compare it to the one scanned
        //then create object
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }
    public void scanCard() throws CardException {

    }
}
