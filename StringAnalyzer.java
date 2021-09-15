package TZ;

public class StringAnalyzer {
    public  static String operationSign;
    public static  String firstOperand;
    public  static String secondStringOperand;
    public  static int secondIntegerOperand;

    public  static String getOperationSign() {
        return operationSign;}
    public  static String getfirstOperand() {
        return firstOperand;}
    public  static String getsecondStringOperand() {
        return secondStringOperand;}
    public  static int getsecondIntegerOperand() {
        return secondIntegerOperand;}


    public StringAnalyzer(String userString) {


        stringNotEmpty(userString);


        definingVariables(userString);
    }



    private void stringNotEmpty(String userString) {

        if (userString == null){
            System.out.println("Error");
        }


             if (userString.equals("\"\"") || userString.equals("")) {
                 System.out.println("Error");
             }

    }

    private void definingVariables(String userString) {

        String[] result = userString.split("\\s+(?=([^\"]*\"[^\"]*\")*[^\"]*$)");


        if (result.length == 3) {




            if (result[0].matches("\".*\"")) {


                if (result[0].length() <= 12) {
                    firstOperand = result[0].replaceAll("\"", "");}
                else{
                    System.out.println("Error");
                }

            } else{
                System.out.println("Error");
            }


            if (result[1].length() == 1) {


                if (!result[1].matches("[/*+-]")) {
                    System.out.println("Error");
                } else {
                    operationSign = result[1];
                }
            }else{
                System.out.println("Error");
            }



            if (result[2].matches("\".*\"")) {


                if (result[2].length() <= 12) {
                    secondStringOperand = result[2].replaceAll("\"", "");
                }


                else{
                    System.out.println("Error");
                }
            } else {
                try {


                    int number = Integer.parseInt(result[2]);


                    if (number >= 1 && number <= 10) {
                        secondIntegerOperand = number;


                    } else{
                        System.out.println("Error");
                    }
                } catch (NumberFormatException ex) {

                        System.out.println("Error");

                }
            }


        } else{
            System.out.println("Error");
        }
    }
}