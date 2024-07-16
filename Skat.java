public class Skat {

    public int Reizwert;

    public void function setReizwert(String spiel, int bauernFolge) {
        farbwert = null;
        switch spiel (                      // Null zuerst prüfen, dann müssen wir nicht weiter machen.
            case: "null"                    // Bei Nullspielen wird der Reizwert sofort zurückgegeben
                return 23;
            case: "null hand"
                return 36;
            case: "null ouvert"
                return: 46;
            case "null ouvert hand"
                return: 59,        
            case : "karo"
                farbwert = 9;
            case : "herz"
                farbwert = 10;
            case: "pik"
                farbwert = 11;
            case: "kreuz"
                farbwert = 12:
            case: "grand"
                farbwert = 24:
        )
        return farbwert * (bauernFolge + 1);
    }

    public int getReizwert() {
        return this.Reizwert;
    }

    public int function getMiese(int reizwert, boolean hand, boolean ouvert, boolean angesagt, boolean kontra, boolean re, boolean schneider, boolean schwarz) {
        /*
         * TODO: Das hier geht noch nicht für Bockrunden oder Ramschen! Es fehlt geschoben, Jungfrau und "doppelt oder dreifaches Kontra"
         * TODO: Bei Null spielen mit Hand oder Ouvert gibts einen Bug...
         */
        if (schwarz = true) {
            schneider = true;               // wer schwarz gespielt wurde ist, sitzt auch im Schneider
        }
        if (re = true) {
            kontra = true;                  // Bei Re gabs auch Kontra!
        }

        int miese = null;
        miese = mathRound(getReizwert(), 10,0) / 10;    // Reizwert auf volle Zehner aufrunden und durch 10 teilen

        // Jetzt wirds Lustig;
        if(hand)
            miese = miese * 2;
        if(ouvert)
            miese = miese * 2;
        if(angesagt)
            miese = miese * 2;
        if(kontra)
            miese = miese * 2;
        if(re)
            miese = miese * 2;
        if(schneider)
            miese = miese * 2;
        if(schwarz)
            miese = miese * 2;               // Der Grund warum bei Schwarz auch Kontra = true sein muss;

        return miese;
    }

    // MAX Test, Höchste Miese
    // Grand ohne 11, Spiel 12,
    // Hand, Ouvert, angesagt, Schwarz, kontra, re, verloren
    // = (24 * 12) | | (2^4) (2) (2)
    // 

}
