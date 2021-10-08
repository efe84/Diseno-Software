package e4;

import java.util.*;

public class Calculator {
                ArrayList<calc> lista = new ArrayList<>();
                public enum operaciones {
                        suma("+"),
                        resta("-"),
                        multiplicacion("*"),
                        division("/");

                        public String op;

                        operaciones(String op) {
                                this.op = op;
                        }

                }

                static class calc{
                        String op;
                        float valor1;
                        float valor2;

                        public calc(String op, float valor1, float valor2){
                                this.op=op;
                                this.valor1=valor1;
                                this.valor2=valor2;

                        }
                }


        /**
         * Public constructor of the calculator .
         */
        public Calculator () {
                new calc(null,0,0);
        }
        /**
         * Clean the internal state of the calculator
         */
        public void cleanOperations () {
                if(lista.size()!=0) {
                        lista.clear();
                }
        }
        /**
         * Add a new operation to the internal state of the calculator .
         * It is worth mentioning that the calculator behaves in an accumulative way ,
         * thus only first operation has two operands .
         * The rest of computations work with the accumulated value and only an extra
         * new operand . Second input value must be ignored if the operation does not
         * correspond to the first one .
         *
         * @param operation operation to add , as string , "+" , " -" , "*" , "/".
         * @param values Operands of the new operation ( one or two operands ).
         * Uses the varargs feature .
         * https :// docs . oracle . com / javase /8/ docs / technotes / guides / language / varargs . html
         * @throws IllegalArgumentException If the operation does not exist .
         */
        public void addOperation ( String operation , float ... values ) {
                float valor1,valor2;
                valor1 = values[0];
                if(operation != "+" && operation != "-" && operation != "*" && operation !="/"){
                        throw new IllegalArgumentException("Not Valid Operation");
                }
                if(values.length == 1){
                        valor2 = 0;
                        lista.add(new calc(operation,valor1,valor2));
                } else if(values.length == 2) {
                        valor2 = values[1];
                        lista.add(new calc(operation,valor1,valor2));
                }
        }
        /**
         * Execute the set of operations of the internal state of the calculator .
         * Once execution is finished , internal state ( operands and operations )
         * is restored ( EVEN if exception occurs ).
         * This calculator works with " Batches " of operations .
         * @return result of the execution
         * @throws ArithmeticException If the operation returns an invalid value
         * ( division by zero )
         */
        public float executeOperations () {
                float resultado = 0;

                return resultado;
        }
        /**
         * Current internal state of calculator is printed
         * FORMAT :
         * "[{+/ -/"/"/*}] value1_value2 [{+/ -/"/"/*}] value1 [{+/ -/"/"/*}] value1 {...}"
         * EXAMPLES : JUnit tests
         * @return String of the internal state of the calculator
         */
        @Override
        public String toString () {
                String concat1 ="[";
                if(this.lista.size() == 0){
                        return "[STATE:]";
                }
                for (int i=0;i<this.lista.size();i++){
                        calc Selected = lista.get(i);
                        String op = Selected.op;
                        String value1 = String.valueOf(Selected.valor1);
                        String value2 = String.valueOf(Selected.valor2);

                        if (i == this.lista.size()-1){
                                concat1 = concat1.concat("STATE:[").concat(op).concat("]").concat(value1).concat("_").concat(value2).concat("]");
                        }

                }
                return concat1; }

}
