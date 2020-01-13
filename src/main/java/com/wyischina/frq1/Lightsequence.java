package com.wyischina.frq1;

    public class LightSequence {
        String seq = "";
        /** The parameter seq is the initial sequence used for
         * the light display
         */

        public LightSequence(String seq)

        { /* implementation not shown */
        this.seq = seq;
        }

        /** Inserts the string segment in the current sequence,
         * starting at the index ind. Returns the new sequence.
         */

        public String insertSegment(String segment, int ind)

        { /* implementation not shown */ }

        /** Updates the sequence to the value in seq
         */

        public void changeSequence(String seq)

        { /* implementation not shown */ }

        /** Uses the current sequence to turn the light on and off
         * for the show
         */

        public void takeOut(String oldSeq, String a){
            String ind;

            // remove space
            if(oldSeq.indexOf(" ") != 0){
                oldSeq.substring(oldSeq.indexOf(" "), oldSeq.indexOf(" ")+1).equals("");
            }

            // remove string a
            for(int i = 0; i <= oldSeq.length()-a.length()+1; i++){
                ind = oldSeq.substring(i,i+a.length());
                if(ind.equals(a)){
                    ind.equals("");
                }
            }
        }

        public double distance(double a, double b){
            double result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            return result;
        }

        public void display()

        { /* implementation not shown */}
    }
