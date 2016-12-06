
public enum direction {              // enum pour definire une variable //
    vide,

Norde {
    @Override
    public String toString() {
        return "Norde";
    }
},                                   // break
    East {
        @Override
        public String toString() {
            return "East";
        }
    },
        South{
            @Override
            public String toString () {
                return "South";
            }
        },
            West {
                @Override
                public String toString() {
                    return "West";
                }
            },

}

