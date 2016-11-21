package tpe.enumeration.own;

public enum WuerfelTyp {


    D4(4), D6(6), D8(8), D10(10), D12(12), D20(20), D22(22);

    private final int anzahlSeiten;

    private WuerfelTyp(int anzahlSeiten){
        this.anzahlSeiten = anzahlSeiten;
    }

    public int getAnzahlSeiten(){
        return anzahlSeiten;
    }

    public double average(){
//        if(A == D4){
//            return 2.5;
//        } if (A == D6){
//            return 3.5;
//        } if (A == D8){
//            return 4.5;
//        } if (A == D10){
//            return 5.5;
//        } if (A == D12){
//            return 6.5;
//        } if (A==D20){
//            return 10.5;
//        }if (A==D22){
//            return 11.5;
//        }return 0.0;
        return anzahlSeiten /2 + 0.5;
    }
//    private final Random rnd = new Random();
//    public int roll() {
//        return rnd.nextInt(anzahlSeiten) + 1;
//    }
}
