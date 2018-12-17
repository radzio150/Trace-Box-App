package sample.backend;

import javax.smartcardio.*;
import java.util.Arrays;
import java.util.List;

public class NfcReaderController {
    private static byte[] GET_UID_COMMAND = new byte[]{(byte) 0xFF, (byte) 0xCA, (byte) 0x00,
            (byte) 0x00, (byte) 0x00};
    private CardChannel channel;
    private Card card;
    private CardTerminal terminal;
    private List<CardTerminal> terminalList;
    private TerminalFactory factory;

    public NfcReaderController() throws CardException{
        this.factory = TerminalFactory.getDefault(); // Creating terminal factory
        this.terminalList = factory.terminals().list(); // Putting terminal into list
        this.terminal = terminalList.get(0); // Creating terminal object from first item in the list
        this.card = terminal.connect("*");
        this.channel = card.getBasicChannel();
    }


    public int getResponseUID() throws CardException {
            CommandAPDU sendCommand = new CommandAPDU(GET_UID_COMMAND);
            ResponseAPDU getResponse = this.channel.transmit(sendCommand);
            new NfcCard(Arrays.hashCode(getResponse.getData()));
            return Arrays.hashCode(getResponse.getData());
    }

    public boolean isCardConnected() throws CardException {
        return this.terminal.isCardPresent();
    }

}
