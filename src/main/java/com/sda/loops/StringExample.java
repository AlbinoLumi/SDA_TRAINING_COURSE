package com.sda.loops;

import java.util.Locale;

public class StringExample {

    public static void main(String[] args) {

            // Per te shtuar ca fjale tek nje String me ndihmen e metodes CONCAT
            String emri = new String("Lejrat");
            String mbiemeri = new String("Mesi");
            String puna = "Trainer";
            String vendlindja = "Shkoder";
            String punaVendlindja = puna.concat(vendlindja);
            String teDhenat = emri.concat(mbiemeri).concat(puna).concat(vendlindja);
            String tedhenat2 = emri.concat(" ").concat(mbiemeri).concat(" ").concat(puna).concat(" ").concat(vendlindja);
            System.out.println(teDhenat);
            System.out.println(tedhenat2);

            // Per te apre nese 2 Strings jane te barabarta
            String emri2 = "SDA " + " lejrat mesi";
            String emri3 = "SdA";
            System.out.println(emri2.equals(emri3));
            System.out.println(emri2.equalsIgnoreCase(emri3));
            System.out.println(tedhenat2.length());
            System.out.println(tedhenat2.toLowerCase(Locale.ROOT));
            System.out.println(tedhenat2.toUpperCase(Locale.ROOT));
            System.out.println(tedhenat2.indexOf("Mesi"));
            System.out.println(tedhenat2.replaceAll("a","w"));

        }
    }






