package sample.backend;

import javax.smartcardio.*;

public class ScanningThread extends Thread implements Runnable{
    public void run() {
        NfcReaderController scanner = null;
        while (true) try {
            int flag = 0;
            scanner = new NfcReaderController();
            if(scanner.isCardConnected()){flag=1;}
            if (flag==1) {
                new NfcCard(scanner.getResponseUID());
                System.out.println(scanner.getResponseUID());
                LoginController.checkInput(scanner.getResponseUID());
                while (flag==1){
                    if(!scanner.isCardConnected()){
                        //save card details
                        //delete object


                        flag=0;
                    }
                }
            }

        } catch (CardException e) {
        }
    }
}
