package TZ;

class Calculate {
    public  static String calculator(String operationSign, String firstOperand, String secondStringOperand,int secondIntegerOperand) {
         String symbol=operationSign;
         String operand1 = firstOperand;
         String operand2 = secondStringOperand;
         int operand3 = secondIntegerOperand;
         String result5 = null ;

        switch (symbol) {
            case "+":
                if (operand2 != null) {

                    result5 = "\"" + operand1 + operand2 + "\"";
                }
                else{
                    System.out.println("Error");
                }
                break;
            case "-":

                if (operand2 != null) {


                    if (operand1.contains(operand2)) {


                        int start = operand1.indexOf(operand2);


                        int end = start + operand2.length();


                        result5 = "\"" + new StringBuilder(operand1).delete(start, end) + "\"";


                    } else{
                        System.out.println("Error");
                    }
                }
                break;
            case "*":
                StringBuilder stringBuilder = new StringBuilder();


                if (operand2 == null) {


                    for (int i = 0; i < operand3; i++) {
                        stringBuilder.append(operand1);
                    }


                    result5 =  "\"" + stringBuilder + "\"";


                } else{
                    System.out.println("Error");
                }
                break;
            case "/":
                StringBuilder stringBuilder1 = new StringBuilder();


                if (operand2 == null) {


                    int iteration = operand1.length() / operand3;


                    for (int i = 0; i < iteration; i++) {
                        stringBuilder1.append(operand1.charAt(i));
                    }


                    result5 =  "\"" + stringBuilder1 + "\"";


                } else{
                    System.out.println("Error");
                }
        }

        return result5;
    }
}