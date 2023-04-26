public class Money{
    public static void main(String [] args){
    int bankBalance = 60000;

    if(bankBalance <= 10000 && bankBalance>= 0){
    System.out.println("Lower middle class");
    }

    else if (bankBalance >=10001 && bankBalance <=20000){
    System.out.println("Middle class");
    }

    else if(bankBalance >=20001 && bankBalance<= 30000){
    System.out.println("Upper Middele class");
    }

    else if(bankBalance >=30001 && bankBalance<= 40000){
    System.out.println("millionar");
    }

    else if(bankBalance >=40001&& bankBalance<=50000){
    System.out.println(" Billionar");
    }

    else if(bankBalance >=50001 && bankBalance<=100000){
    System.out.println(" Trilionar");
    }

    else{
    System.out.println(" please check your input");
    }
    }
    }
    
    

