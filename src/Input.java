public class Input {

    // initiate variables needed in methods
    String userID = null;
    String accountType = null;
    String transactionType = null;
    String amountText = null;
    String date = null;
    double amount = 0;

    public static String getAccountType() {

        //String accountType = (String)pgui.selectAccount.getSelectedItem();

        String accountType = "test";

        System.out.println("Input.getAccountType() was hit");

        return accountType;
    }

    public static String getAccountType(BankingGui pgui) {

        String accountType = (String)pgui.selectAccount.getSelectedItem();

        return accountType;
    }


//    public String getTransactionType() {
//
//        // if the radio button labels were an array in Gui, then I could
//        // use the array in a for-each here instead of hardcoding values
//        if (gui.withdrawRadio.isSelected()) {
//            transactionType = "withdrawal";
//        } else if (makeDepositRadio.isSelected()) {
//            transactionType = "deposit";
//        } else if (viewBalanceRadio.isSelected()) {
//            transactionType = "viewBalance";
//        }
//
//        return transactionType;
//    }
//
//    public String getAccountType() {
//
//        accountType = (String)selectAccount.getSelectedItem();
//
//        return accountType;
//    }
//
//    public double getAmount() {
//
//        // todo - still needs work
//        // this is going to pull the text from the checking deposit text area
//        // waiting for shanea to see if using one jtextarea for all screens works
//        amount = Double.parseDouble(checkDepTest.getText());
//        return amount;
//    }
//
//    public String getDate() {
//
//        // todo - not worked on yet, still waiting on gui
//        return date;
//    }
//
//    public String getUserID() {
//
//        // todo - needs notes still
//        userID = auth.getText();
//        return userID;
//    }
}