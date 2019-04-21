import static java.lang.Math.random;

public class LetsGo {

    public LetsGo() {
    }

    public static void main(String[] args) {
        //Lionel < Andres < Messi
        double weightLionel = 1;
        double weightAndres = 0.7;
        double weightMessi = 0.4;

        RunForYourLife lionel = new RunForYourLife("Lionel", weightLionel);
        RunForYourLife andres = new RunForYourLife("Andres", weightAndres);
        RunForYourLife messi = new RunForYourLife("Messii", weightMessi);

        lionel.start();
        andres.start();
        messi.start();
    }

    public static int getRandomNumber(){
        //Angka acak dari 100 sampai 500
        return (int)(Math.random() * ((5000 - 100) + 1)) + 100;
    }
}
