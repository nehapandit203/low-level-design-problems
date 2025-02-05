package splitwise;

import splitwise.service.Splitwise;

public class RunSplitwiseApplication {

    public static void main(String args[]){

        Splitwise splitwise = new Splitwise();
        splitwise.startApplication();
    }
}
