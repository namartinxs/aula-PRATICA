public class Numeros {

   

    public Numeros (){
       
    }
    public String eOuNaoE ( int Numero){
        String Message = "";
        if(Numero % 2 == 0){
            Message = "O número "+ Numero + " é par ";
        } 
        else{
            Message = "O número "+ Numero + " é ímpar ";
        }

        return Message;
    }

    public String tabuada (){ 
        int decrementador = 9;
        String Message = "";
        // for (int i = 1; i <10; decrementador--, i++){
        for (int i = 1; i <10; i++){
            Message += "\n" + i + " X " + decrementador + " = " + ( i *decrementador);
            decrementador = decrementador -1;
        } 

        return Message;

    }
}
