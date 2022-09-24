package com.sda.classess;

public class Shkolla {
 /*
Do krijoni nje klas shkolla ka atributet katet, emri, numrin e klasave

Do krijoni klasen tjt qe eshte ShkollaImplementation dhe do krijoni objekte te shkolles


*/
        private int katet;
        private String emri;
        private int nrKlasave;

        public Shkolla(){}

        public Shkolla(int katet, String emri, int nrKlasave) {
            this.katet = katet;
            this.emri = emri;
            this.nrKlasave = nrKlasave;
        }

        //getters

        public int getKatet() {
            return katet;
        }

        public String getEmri() {
            return emri;
        }

        public int getNrKlasave() {
            return nrKlasave;
        }

        public void setKatet(int katet) {
            this.katet = katet;
        }

        public void setEmri(String emri) {
            this.emri = emri;
        }

        public void setNrKlasave(int nrKlasave) {
            this.nrKlasave = nrKlasave;
        }
    }


