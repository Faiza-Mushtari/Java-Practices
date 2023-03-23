package BS1328;

public class USDtoBDT {
    public static void main(String[] args) {

        double usd, bdt;

        usd=50;
        bdt=usd*107.00442345f; //numbers are considered as double by default

        System.out.println("50 USD is equal to BDT "+bdt);

    }
}

